# SolarSystemSim
Fly around in first person in your own custom solar system


To create custome solar system edit "planets.txt"

FORMAT FOR "Planets.txt" IS:

 sateliteName1 radius1 speed1 distanceFromParent1 parentName1
 sateliteName2 radius2 speed2 distanceFromParent2 parentName2
 sateliteName2 radius2 speed2 distanceFromParent2 parentName2
 
 
 NOTES:
 
  If parentName == NULL this will be the root of your system (aka the star)
 
  All satelites must of a texture file named "sateliteName.jpg" in the res folder
  
  Default values are our own solar system (not to scale)
 
 
 DEPENDENCIES:
  Proccessing, PeasyCam