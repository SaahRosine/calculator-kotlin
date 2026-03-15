sealed class NetworkState {
    object Loading : NetworkState()
    data class Success(val data: String) : NetworkState()
    data class Error(val message: String) : NetworkState()
}

fun handleState(state: NetworkState) {
    when (state) {
        is NetworkState.Loading -> println("Currently loading...")
        is NetworkState.Success -> println("Operation successful. Data: ${state.data}")
        is NetworkState.Error -> println("An error occurred: ${state.message}")
    }
}

fun main() {
    println("sealed classes make state handling exhaustive and safe")
    
    val loading = NetworkState.Loading
    val success = NetworkState.Success("{"id": 1, "name": "Kotlin"}")
    val error = NetworkState.Error("404 Not Found")

    handleState(loading)
    handleState(success)
    handleState(error)
}
