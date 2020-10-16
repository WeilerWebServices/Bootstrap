/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.resolve.calls;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class EnhancedSignaturesResolvedCallsTestGenerated extends AbstractEnhancedSignaturesResolvedCallsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInEnhancedSignatures() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/collection")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Collection extends AbstractEnhancedSignaturesResolvedCallsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInCollection() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/collection"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("collectionRemoveIf.kt")
        public void testCollectionRemoveIf() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/collection/collectionRemoveIf.kt");
        }

        @TestMetadata("collectionSpliterator.kt")
        public void testCollectionSpliterator() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/collection/collectionSpliterator.kt");
        }

        @TestMetadata("collectionStream.kt")
        public void testCollectionStream() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/collection/collectionStream.kt");
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/iterable")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Iterable extends AbstractEnhancedSignaturesResolvedCallsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInIterable() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/iterable"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("iterableSpliterator.kt")
        public void testIterableSpliterator() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/iterable/iterableSpliterator.kt");
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/iterator")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Iterator extends AbstractEnhancedSignaturesResolvedCallsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInIterator() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/iterator"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("iteratorForEachRemaining.kt")
        public void testIteratorForEachRemaining() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/iterator/iteratorForEachRemaining.kt");
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/list")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class List extends AbstractEnhancedSignaturesResolvedCallsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInList() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/list"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("listReplaceAll.kt")
        public void testListReplaceAll() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/list/listReplaceAll.kt");
        }

        @TestMetadata("listStream.kt")
        public void testListStream() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/list/listStream.kt");
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Map extends AbstractEnhancedSignaturesResolvedCallsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInMap() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/map"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("mapCompute.kt")
        public void testMapCompute() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/map/mapCompute.kt");
        }

        @TestMetadata("mapComputeIfAbsent.kt")
        public void testMapComputeIfAbsent() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/map/mapComputeIfAbsent.kt");
        }

        @TestMetadata("mapComputeIfPresent.kt")
        public void testMapComputeIfPresent() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/map/mapComputeIfPresent.kt");
        }

        @TestMetadata("mapForEach.kt")
        public void testMapForEach() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/map/mapForEach.kt");
        }

        @TestMetadata("mapMerge.kt")
        public void testMapMerge() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/map/mapMerge.kt");
        }

        @TestMetadata("mapPutIfAbsent.kt")
        public void testMapPutIfAbsent() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/map/mapPutIfAbsent.kt");
        }

        @TestMetadata("mapReplace.kt")
        public void testMapReplace() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/map/mapReplace.kt");
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/optional")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Optional extends AbstractEnhancedSignaturesResolvedCallsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInOptional() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/optional"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("optionalEmpty.kt")
        public void testOptionalEmpty() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalEmpty.kt");
        }

        @TestMetadata("optionalGet.kt")
        public void testOptionalGet() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalGet.kt");
        }

        @TestMetadata("optionalIfPresent.kt")
        public void testOptionalIfPresent() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalIfPresent.kt");
        }

        @TestMetadata("optionalOf.kt")
        public void testOptionalOf() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalOf.kt");
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/references")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class References extends AbstractEnhancedSignaturesResolvedCallsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInReferences() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/references"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("softReference.kt")
        public void testSoftReference() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/references/softReference.kt");
        }

        @TestMetadata("weakReference.kt")
        public void testWeakReference() throws Exception {
            runTest("compiler/testData/resolvedCalls/enhancedSignatures/references/weakReference.kt");
        }
    }
}