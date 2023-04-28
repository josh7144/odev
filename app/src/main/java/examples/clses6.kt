package examples



enum class Brand{
    Samsung,
    Apple,
    Xiaomi,
    Huawei,
    Unknown;

    fun marcaEnMinusculas():String{
        return this.toString().lowercase()
    }
}

enum class Color{
    Purple,
    Black,
    Tornasol,
}

open class ElectronicDevice(//constrcutor
    open var brand:Brand = Brand.Apple,
    open var model:String = "",//
    open val width:Float,//no estamos asignando aqui
    open val height:Float,
    open var color:Color = Color.Purple,
):Cloneable{//interfaz  clonenable

 //implementa el metodo clone de interfaz  Clonenable
    public override fun clone(): ElectronicDevice {
          var copia = super.clone()as ElectronicDevice//aqui clona tal cual
              copia.color=Color.Tornasol//aqui cambio de campo color copia profunda
              copia.model="Unknown"
              return copia
    }
  // sobreescribe el metodo toString
    override fun toString(): String {//las clases normales no tienen toestrin por eso hay que sobreescribir
        return "brand:$brand,model:$model,width:$width, height:$height, color:$color "
    }
}//fin de la Clase ElectronicDevice


data class MovilDevice(//constructor
    val NumberCameras:Int,
    val Baterry:Int,
    override var brand:Brand = Brand.Apple,
    override var model:String = "",//
    override var width:Float,// opcional la clase hija lo puede sobrescribir como variable al constante width
    override var height:Float,//la clase hija lo puede sobrescribir como variable al constante height
    override var color:Color = Color.Black,

    ):ElectronicDevice(model="14 Pro Max", height = 12F, width = 1F){//hereda de ElectronicDevice hay que asignar lo que falto asignar los campos

// sobreescribe el metodo
    override fun toString(): String {//concatenamos el toestring de clase padre y las propidades de la clase Movildevice
         //llamada a metodo tostring de clase Electronicdevice por errencia
        return super.toString() + "NumberCameras:$NumberCameras,Baterry:$Baterry"
    }
// metodo propio de la clase MovilDevice
    fun desscripcion():String{
     return ("brand:$brand,cameras: $NumberCameras,Baterry: $Baterry")
    }
}//fin de la Calse MovilDevice

fun main(){


    val iphone=MovilDevice(brand = Brand.Samsung, width = 13F, height = 2F, model ="s23 Ultra",NumberCameras = 3, Baterry = 85,color=Color.Black)

iphone.width=22F;//comprobando que si puedo modificar la constante width por qu la clase hija movildevice lo covertio a variable

    println(iphone)
      val iphone2=iphone.clone()//para class normal
    //val iphone2=iphone.copy(color=Color.Black) //para data class
    println(iphone2)
    println(iphone.desscripcion())
}

