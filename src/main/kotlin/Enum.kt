fun main(args: Array<String>) {
    // Enum
    fun convertTo(amount: Int, amountCurrency: Currency, targetCurrency: Currency): Int {
        val total = (targetCurrency.value * amount) / amountCurrency.value
        return total.toInt()
    }

    val amountInWallet = 500
    val amountCurrency = Currency.BRL

    val targetCurrency = Currency.EUR
    val targetAmount = convertTo(amountInWallet, amountCurrency, targetCurrency)

    println("A conversão de $amountInWallet$amountCurrency para $targetCurrency = $targetAmount")
}
enum class Currency(val value: Double) {
    USD(1.00),
    BRL(5.89),
    EUR(1.09)
}