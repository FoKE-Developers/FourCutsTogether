package com.foke.together.domain.interactor

import com.foke.together.domain.interactor.entity.CameraSourceType
import com.foke.together.domain.output.AppPreferenceInterface
import javax.inject.Inject

class SetCameraSourceTypeUseCase @Inject constructor(
    private val appPreference: AppPreferenceInterface
) {
    suspend operator fun invoke(cameraSourceType: CameraSourceType) =
        appPreference.setCameraSourceType(cameraSourceType)
}