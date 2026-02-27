package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Excluder f10023a = Excluder.f9876d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10024b = 1;
    public final a c = h.f9871a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f10025d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10026g = false;
    public final int h;
    public final int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f10027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10028l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f10029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f10030o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f10031p;

    public k() {
        i iVar = j.f10013n;
        this.h = 2;
        this.i = 2;
        this.j = true;
        this.f10027k = j.f10013n;
        this.f10028l = 0;
        this.m = true;
        this.f10029n = j.f10015p;
        this.f10030o = j.f10016q;
        this.f10031p = new ArrayDeque();
    }

    public final j a() {
        z zVarA;
        z zVarA2;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z4 = com.google.gson.internal.sql.b.f10010a;
        com.google.gson.internal.bind.a aVar = com.google.gson.internal.bind.b.f9936b;
        int i = this.h;
        int i4 = this.i;
        if (i != 2 || i4 != 2) {
            z zVarA3 = aVar.a(i, i4);
            if (z4) {
                zVarA = com.google.gson.internal.sql.b.c.a(i, i4);
                zVarA2 = com.google.gson.internal.sql.b.f10011b.a(i, i4);
            } else {
                zVarA = null;
                zVarA2 = null;
            }
            arrayList3.add(zVarA3);
            if (z4) {
                arrayList3.add(zVarA);
                arrayList3.add(zVarA2);
            }
        }
        return new j(this.f10023a, this.c, new HashMap(this.f10025d), this.f10026g, this.j, this.f10027k, this.f10028l, this.m, this.f10024b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f10029n, this.f10030o, new ArrayList(this.f10031p));
    }

    public final void b(Object obj, Type type) {
        Objects.requireNonNull(type);
        boolean z4 = obj instanceof s;
        com.google.gson.internal.e.b(z4 || (obj instanceof n) || (obj instanceof y));
        if (type == Object.class) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        ArrayList arrayList = this.e;
        if (z4 || (obj instanceof n)) {
            arrayList.add(TreeTypeAdapter.b(TypeToken.get(type), obj));
        }
        if (obj instanceof y) {
            arrayList.add(com.google.gson.internal.bind.i.a(TypeToken.get(type), (y) obj));
        }
    }
}
