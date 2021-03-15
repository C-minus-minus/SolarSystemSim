# SolarSystemSim
Fly around in first person in your own custom solar system

Default values are our own solar system (not to scale)

To create custome solar system edit "planets.txt"

Format for "Planets.txt" is:
 
 sateliteName1 radius1 speed1 distanceFromParent1 parentName1
 sateliteName2 radius2 speed2 distanceFromParent2 parentName2
 sateliteName2 radius2 speed2 distanceFromParent2 parentName2
 
 if parentName == NULL this will be the root of your system (aka the star)
 
 all satelites must of a texture file named "sateliteName.jpg" in the res folder
 
 Dependencies:
 
 Proccessing, PeasyCam
