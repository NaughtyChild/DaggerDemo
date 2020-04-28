package cn.naughtychild.daggerdemo.interfacedemo

class OneEngine : Engine {
    override fun work(): String {
        return "OneEngine"
    }
}

class TwoEngine : Engine {
    override fun work(): String {
        return "TwoEngine"
    }
}