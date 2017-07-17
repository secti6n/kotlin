/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.checkers.javac;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class JavacDiagnosticsTestGenerated extends AbstractJavacDiagnosticsTest {
    @TestMetadata("compiler/testData/javac/diagnostics/tests")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Tests extends AbstractJavacDiagnosticsTest {
        public void testAllFilesPresentInTests() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("compiler/testData/javac/diagnostics/tests/imports")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Imports extends AbstractJavacDiagnosticsTest {
            public void testAllFilesPresentInImports() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/imports"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("AllUnderImportsAmbiguity.kt")
            public void testAllUnderImportsAmbiguity() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/AllUnderImportsAmbiguity.kt");
                doTest(fileName);
            }

            @TestMetadata("AllUnderImportsLessPriority.kt")
            public void testAllUnderImportsLessPriority() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/AllUnderImportsLessPriority.kt");
                doTest(fileName);
            }

            @TestMetadata("ClassImportsConflicting.kt")
            public void testClassImportsConflicting() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ClassImportsConflicting.kt");
                doTest(fileName);
            }

            @TestMetadata("CurrentPackageAndAllUnderImport.kt")
            public void testCurrentPackageAndAllUnderImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndAllUnderImport.kt");
                doTest(fileName);
            }

            @TestMetadata("CurrentPackageAndExplicitImport.kt")
            public void testCurrentPackageAndExplicitImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndExplicitImport.kt");
                doTest(fileName);
            }

            @TestMetadata("CurrentPackageAndExplicitNestedImport.kt")
            public void testCurrentPackageAndExplicitNestedImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndExplicitNestedImport.kt");
                doTest(fileName);
            }

            @TestMetadata("CurrentPackageAndNestedAsteriskImport.kt")
            public void testCurrentPackageAndNestedAsteriskImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndNestedAsteriskImport.kt");
                doTest(fileName);
            }

            @TestMetadata("ImportGenericVsPackage.kt")
            public void testImportGenericVsPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportGenericVsPackage.kt");
                doTest(fileName);
            }

            @TestMetadata("ImportProtectedClass.kt")
            public void testImportProtectedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportProtectedClass.kt");
                doTest(fileName);
            }

            @TestMetadata("ImportTwoTimes.kt")
            public void testImportTwoTimes() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportTwoTimes.kt");
                doTest(fileName);
            }

            @TestMetadata("ImportTwoTimesStar.kt")
            public void testImportTwoTimesStar() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportTwoTimesStar.kt");
                doTest(fileName);
            }

            @TestMetadata("NestedAndTopLevelClassClash.kt")
            public void testNestedAndTopLevelClassClash() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/NestedAndTopLevelClassClash.kt");
                doTest(fileName);
            }

            @TestMetadata("NestedClassClash.kt")
            public void testNestedClassClash() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/NestedClassClash.kt");
                doTest(fileName);
            }

            @TestMetadata("PackageExplicitAndStartImport.kt")
            public void testPackageExplicitAndStartImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/PackageExplicitAndStartImport.kt");
                doTest(fileName);
            }

            @TestMetadata("PackagePrivateAndPublicNested.kt")
            public void testPackagePrivateAndPublicNested() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/PackagePrivateAndPublicNested.kt");
                doTest(fileName);
            }

            @TestMetadata("TopLevelClassVsPackage.kt")
            public void testTopLevelClassVsPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/TopLevelClassVsPackage.kt");
                doTest(fileName);
            }

            @TestMetadata("TopLevelClassVsPackage2.kt")
            public void testTopLevelClassVsPackage2() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/TopLevelClassVsPackage2.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/javac/diagnostics/tests/inners")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Inners extends AbstractJavacDiagnosticsTest {
            public void testAllFilesPresentInInners() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/inners"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("CurrentPackageAndInner.kt")
            public void testCurrentPackageAndInner() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/CurrentPackageAndInner.kt");
                doTest(fileName);
            }

            @TestMetadata("ImportThriceNestedClass.kt")
            public void testImportThriceNestedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/ImportThriceNestedClass.kt");
                doTest(fileName);
            }

            @TestMetadata("InnerInInner.kt")
            public void testInnerInInner() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/InnerInInner.kt");
                doTest(fileName);
            }

            @TestMetadata("ThriceNestedClass.kt")
            public void testThriceNestedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/ThriceNestedClass.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class QualifiedExpression extends AbstractJavacDiagnosticsTest {
            public void testAllFilesPresentInQualifiedExpression() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/qualifiedExpression"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("GenericClassVsPackage.kt")
            public void testGenericClassVsPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/GenericClassVsPackage.kt");
                doTest(fileName);
            }

            @TestMetadata("PackageVsClass.kt")
            public void testPackageVsClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsClass.kt");
                doTest(fileName);
            }

            @TestMetadata("PackageVsClass2.kt")
            public void testPackageVsClass2() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsClass2.kt");
                doTest(fileName);
            }

            @TestMetadata("PackageVsRootClass.kt")
            public void testPackageVsRootClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsRootClass.kt");
                doTest(fileName);
            }

            @TestMetadata("visibleClassVsQualifiedClass.kt")
            public void testVisibleClassVsQualifiedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/visibleClassVsQualifiedClass.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/javac/diagnostics/tests")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TestsWithoutJavac extends AbstractJavacDiagnosticsTest {
        public void testAllFilesPresentInTestsWithoutJavac() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("compiler/testData/javac/diagnostics/tests/imports")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Imports extends AbstractJavacDiagnosticsTest {
            public void testAllFilesPresentInImports() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/imports"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("AllUnderImportsAmbiguity.kt")
            public void testAllUnderImportsAmbiguity() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/AllUnderImportsAmbiguity.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("AllUnderImportsLessPriority.kt")
            public void testAllUnderImportsLessPriority() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/AllUnderImportsLessPriority.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("ClassImportsConflicting.kt")
            public void testClassImportsConflicting() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ClassImportsConflicting.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("CurrentPackageAndAllUnderImport.kt")
            public void testCurrentPackageAndAllUnderImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndAllUnderImport.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("CurrentPackageAndExplicitImport.kt")
            public void testCurrentPackageAndExplicitImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndExplicitImport.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("CurrentPackageAndExplicitNestedImport.kt")
            public void testCurrentPackageAndExplicitNestedImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndExplicitNestedImport.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("CurrentPackageAndNestedAsteriskImport.kt")
            public void testCurrentPackageAndNestedAsteriskImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/CurrentPackageAndNestedAsteriskImport.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("ImportGenericVsPackage.kt")
            public void testImportGenericVsPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportGenericVsPackage.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("ImportProtectedClass.kt")
            public void testImportProtectedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportProtectedClass.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("ImportTwoTimes.kt")
            public void testImportTwoTimes() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportTwoTimes.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("ImportTwoTimesStar.kt")
            public void testImportTwoTimesStar() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/ImportTwoTimesStar.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("NestedAndTopLevelClassClash.kt")
            public void testNestedAndTopLevelClassClash() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/NestedAndTopLevelClassClash.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("NestedClassClash.kt")
            public void testNestedClassClash() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/NestedClassClash.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("PackageExplicitAndStartImport.kt")
            public void testPackageExplicitAndStartImport() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/PackageExplicitAndStartImport.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("PackagePrivateAndPublicNested.kt")
            public void testPackagePrivateAndPublicNested() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/PackagePrivateAndPublicNested.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("TopLevelClassVsPackage.kt")
            public void testTopLevelClassVsPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/TopLevelClassVsPackage.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("TopLevelClassVsPackage2.kt")
            public void testTopLevelClassVsPackage2() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/imports/TopLevelClassVsPackage2.kt");
                doTestWithoutJavacWrapper(fileName);
            }
        }

        @TestMetadata("compiler/testData/javac/diagnostics/tests/inners")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Inners extends AbstractJavacDiagnosticsTest {
            public void testAllFilesPresentInInners() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/inners"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("CurrentPackageAndInner.kt")
            public void testCurrentPackageAndInner() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/CurrentPackageAndInner.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("ImportThriceNestedClass.kt")
            public void testImportThriceNestedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/ImportThriceNestedClass.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("InnerInInner.kt")
            public void testInnerInInner() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/InnerInInner.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("ThriceNestedClass.kt")
            public void testThriceNestedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/inners/ThriceNestedClass.kt");
                doTestWithoutJavacWrapper(fileName);
            }
        }

        @TestMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class QualifiedExpression extends AbstractJavacDiagnosticsTest {
            public void testAllFilesPresentInQualifiedExpression() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/javac/diagnostics/tests/qualifiedExpression"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("GenericClassVsPackage.kt")
            public void testGenericClassVsPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/GenericClassVsPackage.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("PackageVsClass.kt")
            public void testPackageVsClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsClass.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("PackageVsClass2.kt")
            public void testPackageVsClass2() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsClass2.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("PackageVsRootClass.kt")
            public void testPackageVsRootClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/PackageVsRootClass.kt");
                doTestWithoutJavacWrapper(fileName);
            }

            @TestMetadata("visibleClassVsQualifiedClass.kt")
            public void testVisibleClassVsQualifiedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/javac/diagnostics/tests/qualifiedExpression/visibleClassVsQualifiedClass.kt");
                doTestWithoutJavacWrapper(fileName);
            }
        }
    }
}
