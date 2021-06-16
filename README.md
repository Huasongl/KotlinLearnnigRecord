"# KotlinLearningRecord" 
#List of Kotlin 
- create method
  - ``listOf()&mutableListOf()``
  - ``listOf().toMutableList()``
    
- mutator function
  - ``val list = mutableListOf("Eli","Mordoc","Sophie")``
     - ``list[4] = "Reggie"``IndexOutOfBoundsException
     - ``list.add("Reggie")``[Eli,Mordoc,Sophie,Reggie]
     - ``list.add(0,"Reggie)``[Eli,Mordoc,Sophie,Reggie]
     - ``list.addAll(listOf("Reggie","Alex"))``
     - ``mutableListOf("Eli","Mordoc","Sophie")+="Reginald"``
     - ``mutableListOf("Eli","Mordoc","Sophie")+=listof("Alex","Shruti")``
     - ``mutableListof("Eli","Mordoc","Sophie")-=listOf("Eli","Mordoc")``
     - ``list.removeIf{it.contains("o")}``
    
- traversal of list
  - ```list.forEach{it->println("it")}```
  - ``list.forEachIndexed{index,it->...}``
  - ```for(i in 0..n)```
    
  - ```for(patron in patronList)```
    
- Regex("[]")
  - ``string.replace(Regex("[]"){}``