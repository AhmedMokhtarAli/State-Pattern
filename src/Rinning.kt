class Rinning : State {
    override fun alert(context: Context) {
        System.out.println("rinning")
        context.setState(this)
    }
}