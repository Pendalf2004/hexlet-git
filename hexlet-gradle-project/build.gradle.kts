/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.5/samples
 * This project uses @Incubating APIs which are subject to change.
 */
plugins {
    // Поддержка запуска из командной строки
    application
    //id("com.github.ben-manes.versions") version "0.50.0"
}

repositories {
    // Подключаем автоматическая работа с репозиторием Maven Central
    mavenCentral()
}

// Для плагина application указываем главный класс приложения
application {
    // Входная точка
    mainClass.set("io.hexlet.example.App")
}

dependencies {
// https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
implementation("org.apache.commons:commons-lang3:3.14.0")
}
