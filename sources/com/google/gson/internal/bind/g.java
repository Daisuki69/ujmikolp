package com.google.gson.internal.bind;

import We.s;
import com.google.gson.JsonIOException;
import com.google.gson.y;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f9950b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f9951d;
    public final /* synthetic */ y e;
    public final /* synthetic */ y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9952g;
    public final /* synthetic */ boolean h;

    public g(String str, Field field, Method method, y yVar, y yVar2, boolean z4, boolean z5) {
        this.f9951d = method;
        this.e = yVar;
        this.f = yVar2;
        this.f9952g = z4;
        this.h = z5;
        this.f9949a = str;
        this.f9950b = field;
        this.c = field.getName();
    }

    public final void a(j3.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Field field = this.f9950b;
        Method method = this.f9951d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(s.j("Accessor ", i3.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.m(this.f9949a);
        this.e.write(bVar, objInvoke);
    }
}
