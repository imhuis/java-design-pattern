plugins {
    `java-library`
    id("application")
}

repositories {
    mavenLocal()
    maven {
        mavenCentral()
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xlint:deprecation")
}

allprojects {
    group = "com.imhuis.code.design"
    version = "1.0-SNAPSHOT"

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-Xlint:unchecked")
        options.compilerArgs.add("-Xlint:deprecation")
    }

    sourceSets {
        main {
            java {
                srcDirs(projectDir.resolve("src"))
            }
            resources {
                srcDirs(projectDir.resolve("src"))
            }
        }

        test {
            java {
                srcDirs(projectDir.resolve("tests"))
            }
            resources {
                srcDirs(projectDir.resolve("src"))
            }
        }
    }

}

dependencies {
    api("junit:junit:4.13.2")
    api("com.google.guava:guava:31.1-jre")
    api("ch.qos.logback:logback-classic:1.4.7")
    api("cn.hutool:hutool-all:5.8.18")
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
}

//publishing {
//    publications.create<MavenPublication>("maven") {
//        from(components["java"])
//    }
//}
