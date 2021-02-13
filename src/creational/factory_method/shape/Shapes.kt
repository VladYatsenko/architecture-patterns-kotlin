package creational.factory_method.shape

class Circle: Shape() {
    override fun draw() {
        println("Circle::draw()")
    }
}

class Rectangle: Shape() {
    override fun draw() {
        println("Rectangle::draw()")
    }
}

class Triangle: Shape() {
    override fun draw() {
        println("Triangle::draw()")
    }
}