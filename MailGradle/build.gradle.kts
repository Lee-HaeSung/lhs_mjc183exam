plugins {
    id("java")
}

group = "com.lhs.lib"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(group = "com.sun.mail", name = "javax.mail", version = "1.6.2")
}

tasks.test {
    useJUnitPlatform()
}