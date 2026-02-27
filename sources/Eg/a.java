package Eg;

import Mj.i;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import io.ktor.utils.io.D;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mj.a f1353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f1354b;
    public int c;
    public /* synthetic */ Object e;
    public final /* synthetic */ d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, b bVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f = dVar;
        this.f1355g = bVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        a aVar = new a(this.f, this.f1355g, interfaceC1526a);
        aVar.e = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((D) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00e9: INVOKE (r9 I:java.lang.Object) VIRTUAL call: java.lang.Object.getClass():java.lang.Class A[MD:():java.lang.Class<?> (c)] (LINE:234), block:B:52:0x00e9 */
    /* JADX WARN: Path cross not found for [B:30:0x006f, B:33:0x007e], limit reached: 54 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[PHI: r1 r9 r13
  0x0045: PHI (r1v2 io.ktor.utils.io.D) = (r1v5 io.ktor.utils.io.D), (r1v14 io.ktor.utils.io.D) binds: [B:34:0x0090, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r9v2 ??) = (r9v15 ??), (r9v16 ??) binds: [B:34:0x0090, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r13v4 java.lang.Object) = (r13v10 java.lang.Object), (r13v0 java.lang.Object) binds: [B:34:0x0090, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:9:0x001f, B:45:0x00c4, B:25:0x005f, B:28:0x0069, B:30:0x006f, B:33:0x007e, B:36:0x0093, B:37:0x0096, B:39:0x009e, B:42:0x00b3, B:46:0x00d3, B:48:0x00d9, B:51:0x00e8, B:16:0x0037, B:19:0x0042, B:22:0x004d), top: B:55:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: all -> 0x0024, Exception -> 0x00c4, TryCatch #0 {all -> 0x0024, blocks: (B:9:0x001f, B:45:0x00c4, B:25:0x005f, B:28:0x0069, B:30:0x006f, B:33:0x007e, B:36:0x0093, B:37:0x0096, B:39:0x009e, B:42:0x00b3, B:46:0x00d3, B:48:0x00d9, B:51:0x00e8, B:16:0x0037, B:19:0x0042, B:22:0x004d), top: B:55:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:9:0x001f, B:45:0x00c4, B:25:0x005f, B:28:0x0069, B:30:0x006f, B:33:0x007e, B:36:0x0093, B:37:0x0096, B:39:0x009e, B:42:0x00b3, B:46:0x00d3, B:48:0x00d9, B:51:0x00e8, B:16:0x0037, B:19:0x0042, B:22:0x004d), top: B:55:0x000d }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Mj.i] */
    /* JADX WARN: Type inference failed for: r1v16, types: [Mj.i] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [Mj.i] */
    /* JADX WARN: Type inference failed for: r1v7, types: [Mj.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Mj.a] */
    /* JADX WARN: Type inference failed for: r9v10, types: [Mj.a] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Mj.a] */
    /* JADX WARN: Type inference failed for: r9v3, types: [Mj.a] */
    /* JADX WARN: Type inference failed for: r9v4, types: [Mj.a, Mj.i] */
    /* JADX WARN: Type inference failed for: r9v5, types: [Mj.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x009c -> B:45:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c1 -> B:45:0x00c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:54:0x00c4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Eg.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
