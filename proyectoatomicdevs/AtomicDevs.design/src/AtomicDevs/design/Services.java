package AtomicDevs.design;

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import atomicDevs.Condition;
import atomicDevs.ExternalTransitionData;
import atomicDevs.Input;
import atomicDevs.InputPort;
import atomicDevs.InternalTransitionData;
import atomicDevs.Output;
import atomicDevs.OutputPort;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String getExternalTransitionData(ExternalTransitionData data){
    	String cadena = "Output: ";
    	Input input = data.getInput();
    	
    	if(input!=null) {
    		InputPort inputPort =  data.getInput().getInputport();
    		if(inputPort!=null) {
    			cadena+="("+inputPort.getName()+","+inputPort.getVariable()+","+data.getElapsedTimeVariable()+")";
    		}
    		else {
    			cadena+="(<InputPort>,<Variable>"+data.getElapsedTimeVariable()+")";
    		}
    	}
    	else {
    		cadena+="(<InputPort>,<Variable>,<ElapsedTimeVariable>)";
    	}
    	
    	
    	cadena+="\nTransition to: ("+data
					    			.getValuedata()
							    	.stream()
							    	.map(t->t.getValue())
							    	.collect(Collectors.joining(","))+")";
    	cadena+="\nCondition: ";
    	Condition condition = data.getCondition();
    	if(condition!=null && condition.getExpression()!=null)
    		cadena+=data.getCondition().getExpression();
    	else
    		cadena+="<condition>";    	
    	
    		
    	return cadena;
    }
    
    
    public String getInternalTransitionData(InternalTransitionData data){
    	String cadena = "Input: ";
    	Output output = data.getOutput();
    	
    	if(output!=null) {
    		OutputPort outputPort =  data.getOutput().getOutputport();
    		if(outputPort!=null) {
    			cadena+="("+outputPort.getName()+","+outputPort.getVariable()+","+output.getValue()+")";
    		}
    		else {
    			cadena+="(<OutputPort>,<Variable>"+output.getValue()+")";
    		}
    	}
    	else {
    		cadena+="(<OutputPort>,<Variable>,<Output>)";
    	}
    	
    	
    	cadena+="\nTransition to: ("+data
					    			.getValuedata()
							    	.stream()
							    	.map(t->t.getValue())
							    	.collect(Collectors.joining(","))+")";
    	cadena+="\nCondition: ";
    	Condition condition = data.getCondition();
    	if(condition!=null && condition.getExpression()!=null)
    		cadena+=data.getCondition().getExpression();
    	else
    		cadena+="<condition>";    	
    	
    		
    	return cadena;
    }
    
    
}
