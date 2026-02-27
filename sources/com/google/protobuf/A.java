package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends B {
    @Override // com.google.protobuf.B
    public final void a(Object obj, long j) {
        AbstractC1188b abstractC1188b = (AbstractC1188b) ((InterfaceC1206u) o0.c.i(obj, j));
        if (abstractC1188b.f10078a) {
            abstractC1188b.f10078a = false;
        }
    }

    @Override // com.google.protobuf.B
    public final void b(Object obj, Object obj2, long j) {
        n0 n0Var = o0.c;
        InterfaceC1206u interfaceC1206uMutableCopyWithCapacity = (InterfaceC1206u) n0Var.i(obj, j);
        InterfaceC1206u interfaceC1206u = (InterfaceC1206u) n0Var.i(obj2, j);
        int size = interfaceC1206uMutableCopyWithCapacity.size();
        int size2 = interfaceC1206u.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1188b) interfaceC1206uMutableCopyWithCapacity).f10078a) {
                interfaceC1206uMutableCopyWithCapacity = interfaceC1206uMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            interfaceC1206uMutableCopyWithCapacity.addAll(interfaceC1206u);
        }
        if (size > 0) {
            interfaceC1206u = interfaceC1206uMutableCopyWithCapacity;
        }
        o0.o(obj, j, interfaceC1206u);
    }
}
