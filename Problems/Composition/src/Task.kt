// write the classes here
class OperatingSystem(var name: String = "Kotlin")

class DualBoot(var primaryOs: OperatingSystem = OperatingSystem("Code"),
               var secondaryOs: OperatingSystem = OperatingSystem("Bad"))