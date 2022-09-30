package com.gl4.tp01

import kotlin.math.abs

class Rectangle(val p : Point=Point(0,0), val q:Point = Point(1,1)) {
    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface():Int {
        return (abs(q.x - p.x))*abs((q.y - p.y))
    }
}