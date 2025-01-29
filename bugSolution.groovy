```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { item ->
      println item.toUpperCase()
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['apple', 'banana'])