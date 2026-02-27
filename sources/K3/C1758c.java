package k3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: renamed from: k3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1758c implements Externalizable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18050d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18051g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18048a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18049b = "";
    public final ArrayList c = new ArrayList();
    public String e = "";
    public boolean f = false;
    public String h = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.f18048a = objectInput.readUTF();
        this.f18049b = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i4 = 0; i4 < i; i4++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f18050d = true;
            this.e = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f18051g = true;
            this.h = utf2;
        }
        this.f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f18048a);
        objectOutput.writeUTF(this.f18049b);
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.c.get(i));
        }
        objectOutput.writeBoolean(this.f18050d);
        if (this.f18050d) {
            objectOutput.writeUTF(this.e);
        }
        objectOutput.writeBoolean(this.f18051g);
        if (this.f18051g) {
            objectOutput.writeUTF(this.h);
        }
        objectOutput.writeBoolean(this.f);
    }
}
