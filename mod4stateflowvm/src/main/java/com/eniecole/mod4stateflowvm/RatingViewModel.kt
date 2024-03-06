package com.eniecole.mod4stateflowvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RatingViewModel : ViewModel() {
    private val _ratingState = MutableStateFlow<RatingState>(RatingState.Initial)
    val ratingState: StateFlow<RatingState> = _ratingState

    fun updateRating(rating: Int) {
        viewModelScope.launch {
            if (rating >= 8) {
                _ratingState.value = RatingState.Success(rating)
            } else {
                _ratingState.value = RatingState.RequestFeedback(rating)
            }
        }
    }
}

sealed class RatingState(var note : Int? = null) {
    data object Initial : RatingState()
    class Success(note: Int?) : RatingState(note)
    class RequestFeedback(note: Int?) : RatingState(note)
}
