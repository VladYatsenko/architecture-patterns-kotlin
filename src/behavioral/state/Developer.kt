package behavioral.state

class Developer {

    private var activity: Activity? = null

    fun changeActivityState(activity: Activity){
        this.activity = activity
    }

    fun changeActivity(){
        val activity = when(activity){
            is Sleeping -> Training()
            is Training -> Coding()
            is Coding -> Reading()
            is Reading ->  Sleeping()
            else -> Sleeping()
        }
        changeActivityState(activity)
    }

    fun justDoIt(){
        activity?.justDoIt()
    }

}