package k3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: renamed from: k3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1761f implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18100a;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18101b = "";
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18102d = new ArrayList();
    public String f = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f18100a = true;
            this.f18101b = utf;
        }
        int i = objectInput.readInt();
        for (int i4 = 0; i4 < i; i4++) {
            this.c.add(Integer.valueOf(objectInput.readInt()));
        }
        int i6 = objectInput.readInt();
        for (int i10 = 0; i10 < i6; i10++) {
            this.f18102d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.e = true;
            this.f = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f18100a);
        if (this.f18100a) {
            objectOutput.writeUTF(this.f18101b);
        }
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) this.c.get(i)).intValue());
        }
        ArrayList arrayList = this.f18102d;
        int size2 = arrayList.size();
        objectOutput.writeInt(size2);
        for (int i4 = 0; i4 < size2; i4++) {
            objectOutput.writeInt(((Integer) arrayList.get(i4)).intValue());
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
    }
}
