package k3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: renamed from: k3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1759d implements Externalizable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1761f f18052B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f18053K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1761f f18054P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f18055Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1761f f18056R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f18057S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C1761f f18058T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f18059U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C1761f f18060V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f18061W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f18062X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f18063Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f18064Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18065a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f18066a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1761f f18067b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f18068b0;
    public boolean c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f18069c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1761f f18070d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f18071d0;
    public boolean e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f18072e0;
    public C1761f f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f18073f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18074g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f18075g0;
    public C1761f h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f18076h0;
    public boolean i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f18077i0;
    public C1761f j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f18078j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18079k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ArrayList f18080k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1761f f18081l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ArrayList f18082l0;
    public boolean m;
    public boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1761f f18083n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f18084n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18085o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f18086o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1761f f18087p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f18088p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18089q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f18090q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1761f f18091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1761f f18093t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18094u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1761f f18095v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1761f f18097x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18098y;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            C1761f c1761f = new C1761f();
            c1761f.readExternal(objectInput);
            this.f18065a = true;
            this.f18067b = c1761f;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f2 = new C1761f();
            c1761f2.readExternal(objectInput);
            this.c = true;
            this.f18070d = c1761f2;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f3 = new C1761f();
            c1761f3.readExternal(objectInput);
            this.e = true;
            this.f = c1761f3;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f4 = new C1761f();
            c1761f4.readExternal(objectInput);
            this.f18074g = true;
            this.h = c1761f4;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f5 = new C1761f();
            c1761f5.readExternal(objectInput);
            this.i = true;
            this.j = c1761f5;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f6 = new C1761f();
            c1761f6.readExternal(objectInput);
            this.f18079k = true;
            this.f18081l = c1761f6;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f7 = new C1761f();
            c1761f7.readExternal(objectInput);
            this.m = true;
            this.f18083n = c1761f7;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f8 = new C1761f();
            c1761f8.readExternal(objectInput);
            this.f18085o = true;
            this.f18087p = c1761f8;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f9 = new C1761f();
            c1761f9.readExternal(objectInput);
            this.f18089q = true;
            this.f18091r = c1761f9;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f10 = new C1761f();
            c1761f10.readExternal(objectInput);
            this.f18092s = true;
            this.f18093t = c1761f10;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f11 = new C1761f();
            c1761f11.readExternal(objectInput);
            this.f18094u = true;
            this.f18095v = c1761f11;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f12 = new C1761f();
            c1761f12.readExternal(objectInput);
            this.f18096w = true;
            this.f18097x = c1761f12;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f13 = new C1761f();
            c1761f13.readExternal(objectInput);
            this.f18098y = true;
            this.f18052B = c1761f13;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f14 = new C1761f();
            c1761f14.readExternal(objectInput);
            this.f18053K = true;
            this.f18054P = c1761f14;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f15 = new C1761f();
            c1761f15.readExternal(objectInput);
            this.f18055Q = true;
            this.f18056R = c1761f15;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f16 = new C1761f();
            c1761f16.readExternal(objectInput);
            this.f18057S = true;
            this.f18058T = c1761f16;
        }
        if (objectInput.readBoolean()) {
            C1761f c1761f17 = new C1761f();
            c1761f17.readExternal(objectInput);
            this.f18059U = true;
            this.f18060V = c1761f17;
        }
        this.f18061W = objectInput.readUTF();
        this.f18062X = objectInput.readInt();
        this.f18063Y = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f18064Z = true;
            this.f18066a0 = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f18068b0 = true;
            this.f18069c0 = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.f18071d0 = true;
            this.f18072e0 = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.f18073f0 = true;
            this.f18075g0 = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.f18076h0 = true;
            this.f18077i0 = utf5;
        }
        this.f18078j0 = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i4 = 0; i4 < i; i4++) {
            C1758c c1758c = new C1758c();
            c1758c.readExternal(objectInput);
            this.f18080k0.add(c1758c);
        }
        int i6 = objectInput.readInt();
        for (int i10 = 0; i10 < i6; i10++) {
            C1758c c1758c2 = new C1758c();
            c1758c2.readExternal(objectInput);
            this.f18082l0.add(c1758c2);
        }
        this.m0 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.f18084n0 = true;
            this.f18086o0 = utf6;
        }
        this.f18088p0 = objectInput.readBoolean();
        this.f18090q0 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f18065a);
        if (this.f18065a) {
            this.f18067b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.f18070d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18074g);
        if (this.f18074g) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i);
        if (this.i) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18079k);
        if (this.f18079k) {
            this.f18081l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.m);
        if (this.m) {
            this.f18083n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18085o);
        if (this.f18085o) {
            this.f18087p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18089q);
        if (this.f18089q) {
            this.f18091r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18092s);
        if (this.f18092s) {
            this.f18093t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18094u);
        if (this.f18094u) {
            this.f18095v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18096w);
        if (this.f18096w) {
            this.f18097x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18098y);
        if (this.f18098y) {
            this.f18052B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18053K);
        if (this.f18053K) {
            this.f18054P.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18055Q);
        if (this.f18055Q) {
            this.f18056R.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18057S);
        if (this.f18057S) {
            this.f18058T.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f18059U);
        if (this.f18059U) {
            this.f18060V.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f18061W);
        objectOutput.writeInt(this.f18062X);
        objectOutput.writeUTF(this.f18063Y);
        objectOutput.writeBoolean(this.f18064Z);
        if (this.f18064Z) {
            objectOutput.writeUTF(this.f18066a0);
        }
        objectOutput.writeBoolean(this.f18068b0);
        if (this.f18068b0) {
            objectOutput.writeUTF(this.f18069c0);
        }
        objectOutput.writeBoolean(this.f18071d0);
        if (this.f18071d0) {
            objectOutput.writeUTF(this.f18072e0);
        }
        objectOutput.writeBoolean(this.f18073f0);
        if (this.f18073f0) {
            objectOutput.writeUTF(this.f18075g0);
        }
        objectOutput.writeBoolean(this.f18076h0);
        if (this.f18076h0) {
            objectOutput.writeUTF(this.f18077i0);
        }
        objectOutput.writeBoolean(this.f18078j0);
        ArrayList arrayList = this.f18080k0;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C1758c) arrayList.get(i)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.f18082l0;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i4 = 0; i4 < size2; i4++) {
            ((C1758c) arrayList2.get(i4)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.m0);
        objectOutput.writeBoolean(this.f18084n0);
        if (this.f18084n0) {
            objectOutput.writeUTF(this.f18086o0);
        }
        objectOutput.writeBoolean(this.f18088p0);
        objectOutput.writeBoolean(this.f18090q0);
    }
}
