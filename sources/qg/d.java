package Qg;

import Ej.InterfaceC0231i;
import com.google.gson.JsonIOException;
import com.google.gson.internal.n;
import com.google.gson.j;
import defpackage.AbstractC1414e;
import gj.InterfaceC1526a;
import java.io.IOException;
import java.io.OutputStreamWriter;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements InterfaceC0231i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutputStreamWriter f5375b;
    public final /* synthetic */ f c;

    public d(OutputStreamWriter outputStreamWriter, f fVar) {
        this.f5375b = outputStreamWriter;
        this.c = fVar;
    }

    @Override // Ej.InterfaceC0231i
    public final Object emit(Object obj, InterfaceC1526a interfaceC1526a) throws IOException {
        int i = this.f5374a;
        this.f5374a = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        OutputStreamWriter outputStreamWriter = this.f5375b;
        if (i > 0) {
            outputStreamWriter.write(44);
        }
        j jVar = this.c.f5378a;
        if (obj != null) {
            try {
                jVar.n(obj, obj.getClass(), jVar.j(AbstractC1414e.u(outputStreamWriter) ? outputStreamWriter : new n(outputStreamWriter)));
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        } else {
            try {
                jVar.m(jVar.j(AbstractC1414e.u(outputStreamWriter) ? outputStreamWriter : new n(outputStreamWriter)));
            } catch (IOException e7) {
                throw new JsonIOException(e7);
            }
        }
        outputStreamWriter.flush();
        return Unit.f18162a;
    }
}
