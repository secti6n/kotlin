import org.gradle.jvm.tasks.Jar

apply { plugin("kotlin") }

dependencies {
    compile(project(":kotlin-stdlib"))
    compile(project(":core"))
    compile(project(":compiler:frontend"))
    compile(project(":compiler:frontend.java"))
    compile(project(":compiler:frontend.script"))
    compile(project(":compiler:light-classes"))
    compile(project(":compiler:util"))
    compile(project(":j2k"))
    compile(project(":idea:ide-common"))
    compile(project(":idea:idea-jps-common"))
    compile(ideaSdkCoreDeps("intellij-core", "util"))
    compile(ideaSdkDeps("openapi", "idea"))
    compile(ideaPluginDeps("gradle-tooling-api", "gradle", plugin = "gradle"))
    compile(preloadedDeps("uast-common", "kotlinx-coroutines-core"))
    buildVersion()
}

configureKotlinProjectSources("idea-core/src", "idea-analysis/src", sourcesBaseDir = File(rootDir, "idea"))
configureKotlinProjectNoTests()

tasks.withType<Jar> {
    from(File(rootDir, "idea/idea-analysis/src")) {
        include("**/*.properties")
    }
}


