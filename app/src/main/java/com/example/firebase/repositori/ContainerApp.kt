package com.example.firebase.repositori

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}
class DefaultContainerApp : ContainerApp{
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}
class AplikasiDataSiswa : Application(){
    lateinit var containerApp: ContainerApp
    override fun onCreate(){
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}