package com.atrasvida.admobvida.observable;

import java.io.Serializable

/** queue observer **/
class OooO(private var oooo: String) : O0Oo, Serializable {

    /*** queue functions **/
    var oooO: ArrayList<((String) -> Unit)> = arrayListOf()

    /*** geter **/
    override fun ooOo(oOoo: (String) -> Unit) {
        if (oooo.isNotEmpty())
            oOoo(oooo)
        else
            oooO.add(oOoo)
    }

    /*** seter* */
    override fun ooOO(oooo: String) {
        this.oooo = oooo
        for (oOoo in oooO) {
            oOoo(oooo)
        }
        oooO.clear()
    }
}

