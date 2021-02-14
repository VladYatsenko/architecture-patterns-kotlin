package structural.composite

/*
* Паттерн Компоновщик (Composite) объединяет группы объектов в древовидную структуру по принципу "часть-целое
* и позволяет клиенту одинаково работать как с отдельными объектами, так и с группой объектов.
*
* Component: определяет интерфейс для всех компонентов в древовидной структуре
* Composite: представляет компонент, который может содержать другие компоненты и реализует механизм для их добавления и удаления
* Leaf: представляет отдельный компонент, который не может содержать другие компоненты
* */

fun main(){

    val fileSystem: Component = Directory("Файловая система")
    // определяем новый диск
    val diskC: Component = Directory("Диск С")
    // новые файлы
    val pngFile: Component = File("12345.png")
    val docxFile: Component = File("Document.docx")
    // добавляем файлы на диск С
    diskC.add(pngFile)
    diskC.add(docxFile)
    // добавляем диск С в файловую систему
    fileSystem.add(diskC)
    // выводим все данные
    fileSystem.display()
    // удаляем с диска С файл
    diskC.remove(pngFile)
    // создаем новую папку
    val docsFolder: Component = Directory("Мои Документы")
    // добавляем в нее файлы
    val txtFile: Component = File("readme.txt")
    val csFile: Component = File("Program.cs")
    docsFolder.add(txtFile)
    docsFolder.add(csFile)
    diskC.add(docsFolder)

}