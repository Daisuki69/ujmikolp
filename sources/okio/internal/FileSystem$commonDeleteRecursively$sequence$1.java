package okio.internal;

import bj.AbstractC1039j;
import cj.C1124j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1615i;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okio.FileSystem;
import okio.Path;
import yj.k;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1611e(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
public final class FileSystem$commonDeleteRecursively$sequence$1 extends AbstractC1615i implements Function2<k, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, InterfaceC1526a<? super FileSystem$commonDeleteRecursively$sequence$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, interfaceC1526a);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            k kVar = (k) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            C1124j c1124j = new C1124j();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(kVar, fileSystem, c1124j, path, false, true, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k kVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(kVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }
}
