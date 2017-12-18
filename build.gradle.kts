plugins {
    id("java-library")
}

repositories {
    jcenter()
}

dependencies {
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.16.18")
    compile(group = "com.fasterxml.jackson.core", name = "jackson-databind", version = "2.9.3")
    compile(group = "com.fasterxml.jackson.datatype", name = "jackson-datatype-jsr310", version = "2.9.3")
    compileOnly(group = "org.jetbrains", name = "annotations", version = "13.0")
}
