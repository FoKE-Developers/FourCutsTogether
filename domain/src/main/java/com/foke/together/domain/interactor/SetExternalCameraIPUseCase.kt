package com.foke.together.domain.interactor

import com.foke.together.domain.interactor.entity.ExternalCameraIP
import com.foke.together.domain.output.AppPreferenceInterface
import com.foke.together.domain.output.ExternalCameraRepositoryInterface
import javax.inject.Inject

class SetExternalCameraIPUseCase @Inject constructor(
    private val appPreference: AppPreferenceInterface,
    private val externalCameraRepository: ExternalCameraRepositoryInterface
) {
    suspend operator fun invoke(externalCameraIP: ExternalCameraIP) {
        appPreference.setExternalCameraIP(externalCameraIP)
        externalCameraRepository.setCameraSourceUrl(externalCameraIP.address)
    }
}