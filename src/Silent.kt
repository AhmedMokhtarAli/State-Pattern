class Silent : State {
    override fun alert(context: Context) {
        System.out.println("silent")
        context.setState(this)
    }

}