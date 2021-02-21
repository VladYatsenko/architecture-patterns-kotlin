package behavioral.strategy

class Developer {

    private var activity: Activity? = null

    fun changeActivityState(activity: Activity){
        this.activity = activity
    }

    fun executeActivity(){
        activity?.justDoIt()
    }

}