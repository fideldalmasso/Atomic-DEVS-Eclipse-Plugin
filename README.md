# About

This software tool employs enriched UML statecharts for the
graphical definition and representation of DEVS Atomic Models. This tool is deployed as a plugin for the Eclipse Platform.

# Screenshots
![](/pictures/Screenshot01.png?raw=true "Switch Example Screenshot")
![](/pictures/Screenshot02.png?raw=true "TrafficLight Example Screenshot")

# Underlying metamodel
![](/pictures/Metamodel.png?raw=true "Metamodel")

# Dependencies
* [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2022-06/r/eclipse-modeling-tools) (tested on 2022-06 version)
* [Sirius 7.0](https://marketplace.eclipse.org/content/sirius) (install via Eclipse Marketplace)
* [Eclipse OCL](https://marketplace.eclipse.org/content/eclipse-ocl) (install via Eclipse Marketplace)
* [Java 8 JDK](https://www.oracle.com/java/technologies/downloads/#java8-windows) (tested on version  8u333)

# Installation instructions

First, clone the repository
```bash
git clone https://github.com/fideldalmasso/Atomic-DEVS-Eclipse-Plugin.git
```

# Running method 1: *as Eclipse Runtime Application*

In Eclipse Modeling Tools, use 

```File > Import > Git > Projects from Git (with smart import)```

to import all 4 projects (AtomicDevs, AtomicDevs.design, AtomicDevs.edit, AtomicDevs.editor) in Eclipse workspace.

Then right click over any project in Model Explorer View and choose 

```Run As > Eclipse Application```

A new instance of Eclipse will be launched and the plugin should be available to use there.

# Running method 2: *using binaries*

Binaries for Windows 64bits are available under ```/binaries```. 

All 4 ```.jar``` files should be copied in  
```{Your_Eclipse_Modeling_Installation_Folder}/dropins```

Next time you run Eclipse Modeling Tools, the plugin shoud be available to use.

# Usage Tutorials
The following videos contain practical examples of the tool usage
* [Switch Example](https://drive.google.com/file/d/197Qj3NmSPfE7DRdM2PmyU1ZR5YFNcgQz/view?usp=sharing)
* [TrafficLight Example](https://drive.google.com/file/d/1W5_c16Nu23KU4c_zfLCkY0mVYgv18ofq/view?usp=sharing)

# Troubleshooting
## ~ Java related problems ~
Make sure you have installed the correct Java version required and that Eclipse Modeling Tools is using it. To check this, go to

``` Window > Preferences > Java > Compiler > Compiler compliance level``` 

and select ```1.8```. Also, verify that under 

```Installed JREs > Execution environment > JavaSE-1.8``` 

there is a compatible JRE selected.

## ~ Sirius installation problems ~ 
Sirius may throw errors/warnings during installation via Eclipse Marketplace, but it is safe to ignore them for now.
