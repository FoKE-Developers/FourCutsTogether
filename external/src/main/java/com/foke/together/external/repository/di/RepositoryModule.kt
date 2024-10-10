package com.foke.together.external.repository.di

import com.foke.together.domain.output.ExternalCameraRepositoryInterface
import com.foke.together.domain.output.ImageRepositoryInterface
import com.foke.together.domain.output.QRCodeRepositoryInterface
import com.foke.together.external.repository.ExternalCameraRepository
import com.foke.together.external.repository.ImageRepository
import com.foke.together.external.repository.QRCodeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindAppPreferenceRepository(
        externalCameraRepository: ExternalCameraRepository
    ): ExternalCameraRepositoryInterface

    @Singleton
    @Binds
    abstract fun bindImageRepository(
        imageRepository: ImageRepository
    ): ImageRepositoryInterface

    @Singleton
    @Binds
    abstract fun bindQRCodeRepository(
        qrCodeRepository: QRCodeRepository
    ): QRCodeRepositoryInterface
}