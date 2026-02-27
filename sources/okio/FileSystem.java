package okio;

import bj.C1030a;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import okio.Path;
import okio.internal.ResourceFileSystem;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            j.g(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m410write$default(FileSystem fileSystem, Path file, boolean z4, Function1 writerAction, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        j.g(file, "file");
        j.g(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z4));
        Object th2 = null;
        try {
            Object objInvoke = writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = objInvoke;
        } catch (Throwable th4) {
            th = th4;
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    C1030a.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        j.f(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        j.f(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z4, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        return fileSystem.appendingSink(path, z4);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z4, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        fileSystem.createDirectories(path, z4);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z4, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        fileSystem.createDirectory(path, z4);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z4, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        fileSystem.delete(path, z4);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z4, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        fileSystem.deleteRecursively(path, z4);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ Sequence listRecursively$default(FileSystem fileSystem, Path path, boolean z4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        return fileSystem.listRecursively(path, z4);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z4, boolean z5, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z5 = false;
        }
        return fileSystem.openReadWrite(path, z4, z5);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z4, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        return fileSystem.sink(path, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m411read(Path file, Function1<? super BufferedSource, ? extends T> readerAction) throws IOException {
        j.g(file, "file");
        j.g(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        T t5 = null;
        try {
            Object objInvoke = readerAction.invoke(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    this = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.j.g(r3, r0)
                    java.lang.String r0 = "readerAction"
                    kotlin.jvm.internal.j.g(r4, r0)
                    okio.Source r3 = r2.source(r3)
                    okio.BufferedSource r3 = okio.Okio.buffer(r3)
                    r0 = 0
                    java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L22
                    if (r3 == 0) goto L1e
                    r3.close()     // Catch: java.lang.Throwable -> L1d
                    goto L1e
                L1d:
                    r0 = move-exception
                L1e:
                    r1 = r0
                    r0 = r4
                    r4 = r1
                    goto L2d
                L22:
                    r4 = move-exception
                    if (r3 == 0) goto L2d
                    r3.close()     // Catch: java.lang.Throwable -> L29
                    goto L2d
                L29:
                    r3 = move-exception
                    bj.C1030a.a(r4, r3)
                L2d:
                    if (r4 != 0) goto L30
                    return r0
                L30:
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: okio.FileSystem.m411read(okio.Path, kotlin.jvm.functions.Function1):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r5v4 */
            /* JADX INFO: renamed from: -write, reason: not valid java name */
            public final <T> T m412write(Path file, boolean z4, Function1<? super BufferedSink, ? extends T> writerAction) throws IOException {
                j.g(file, "file");
                j.g(writerAction, "writerAction");
                BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z4));
                T t5 = null;
                try {
                    Object objInvoke = writerAction.invoke(bufferedSinkBuffer);
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                        } catch (Throwable 
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                            	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "file"
                            kotlin.jvm.internal.j.g(r3, r0)
                            java.lang.String r0 = "writerAction"
                            kotlin.jvm.internal.j.g(r5, r0)
                            okio.Sink r3 = r2.sink(r3, r4)
                            okio.BufferedSink r3 = okio.Okio.buffer(r3)
                            r4 = 0
                            java.lang.Object r5 = r5.invoke(r3)     // Catch: java.lang.Throwable -> L22
                            if (r3 == 0) goto L1e
                            r3.close()     // Catch: java.lang.Throwable -> L1d
                            goto L1e
                        L1d:
                            r4 = move-exception
                        L1e:
                            r1 = r5
                            r5 = r4
                            r4 = r1
                            goto L2d
                        L22:
                            r5 = move-exception
                            if (r3 == 0) goto L2d
                            r3.close()     // Catch: java.lang.Throwable -> L29
                            goto L2d
                        L29:
                            r3 = move-exception
                            bj.C1030a.a(r5, r3)
                        L2d:
                            if (r5 != 0) goto L30
                            return r4
                        L30:
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: okio.FileSystem.m412write(okio.Path, boolean, kotlin.jvm.functions.Function1):java.lang.Object");
                    }

                    public final Sink appendingSink(Path file) throws IOException {
                        j.g(file, "file");
                        return appendingSink(file, false);
                    }

                    public abstract Sink appendingSink(Path path, boolean z4) throws IOException;

                    public abstract void atomicMove(Path path, Path path2) throws IOException;

                    public abstract Path canonicalize(Path path) throws IOException;

                    public void copy(Path source, Path target) throws IOException {
                        j.g(source, "source");
                        j.g(target, "target");
                        okio.internal.FileSystem.commonCopy(this, source, target);
                    }

                    public final void createDirectories(Path dir, boolean z4) throws IOException {
                        j.g(dir, "dir");
                        okio.internal.FileSystem.commonCreateDirectories(this, dir, z4);
                    }

                    public final void createDirectory(Path dir) throws IOException {
                        j.g(dir, "dir");
                        createDirectory(dir, false);
                    }

                    public abstract void createDirectory(Path path, boolean z4) throws IOException;

                    public abstract void createSymlink(Path path, Path path2) throws IOException;

                    public final void delete(Path path) throws IOException {
                        j.g(path, "path");
                        delete(path, false);
                    }

                    public abstract void delete(Path path, boolean z4) throws IOException;

                    public void deleteRecursively(Path fileOrDirectory, boolean z4) throws IOException {
                        j.g(fileOrDirectory, "fileOrDirectory");
                        okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, z4);
                    }

                    public final boolean exists(Path path) throws IOException {
                        j.g(path, "path");
                        return okio.internal.FileSystem.commonExists(this, path);
                    }

                    public abstract List<Path> list(Path path) throws IOException;

                    public abstract List<Path> listOrNull(Path path);

                    public Sequence<Path> listRecursively(Path dir, boolean z4) {
                        j.g(dir, "dir");
                        return okio.internal.FileSystem.commonListRecursively(this, dir, z4);
                    }

                    public final FileMetadata metadata(Path path) throws IOException {
                        j.g(path, "path");
                        return okio.internal.FileSystem.commonMetadata(this, path);
                    }

                    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

                    public abstract FileHandle openReadOnly(Path path) throws IOException;

                    public final FileHandle openReadWrite(Path file) throws IOException {
                        j.g(file, "file");
                        return openReadWrite(file, false, false);
                    }

                    public abstract FileHandle openReadWrite(Path path, boolean z4, boolean z5) throws IOException;

                    public final Sink sink(Path file) throws IOException {
                        j.g(file, "file");
                        return sink(file, false);
                    }

                    public abstract Sink sink(Path path, boolean z4) throws IOException;

                    public abstract Source source(Path path) throws IOException;

                    public final void createDirectories(Path dir) throws IOException {
                        j.g(dir, "dir");
                        createDirectories(dir, false);
                    }

                    public final void deleteRecursively(Path fileOrDirectory) throws IOException {
                        j.g(fileOrDirectory, "fileOrDirectory");
                        deleteRecursively(fileOrDirectory, false);
                    }

                    public final Sequence<Path> listRecursively(Path dir) {
                        j.g(dir, "dir");
                        return listRecursively(dir, false);
                    }
                }
