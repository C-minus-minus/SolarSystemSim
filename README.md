# SolarSystemSim
Fly around in first person in your own custom solar system. Watch moons orbit plants and planets orbit the sun

# Screenshot

![Alt text](res/screenshot.PNG?raw=true)

# controls
     * Use WASD to move around, mouse moves camera. If you've ever played something like minecraft you'll be fine XD
     * The 'p' key pauses all orbits so you can get a closer look at your star system.

# "Planets.txt":
 * To create custome solar system edit "planets.txt"
 * The Format is: "sateliteName radius speed distanceFromParent parentName"
 * Notes
      * If parentName == NULL this will be the root of your system (aka the star)
      * All satelites must of a texture file named "sateliteName.jpg" in the res folder
      * Default values are our own solar system (not to scale, that would be boring)
      * The default textures are based on NASA elevation and imagery data. They were collected from Messenger, Viking and Cassini, and the Hubble Space Telescope.
  
# DEPENDENCIES:
  * Proccessing
  * PeasyCam
