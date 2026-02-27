package defpackage;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "Dimension#ADAPTER", jsonName = "defaultResolution", schemaIndex = 1, tag = 2)
    private final Dimension default_resolution;

    @WireField(adapter = "Dimension#ADAPTER", jsonName = "maxResolution", schemaIndex = 0, tag = 1)
    private final Dimension max_resolution;

    @WireField(adapter = "Dimension#ADAPTER", jsonName = "supportedResolutions", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Dimension> supported_resolutions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String version;
    public static final C2156q Companion = new C2156q();
    public static final ProtoAdapter<Camera> ADAPTER = new C1999p(FieldEncoding.LENGTH_DELIMITED, z.a(Camera.class), "type.googleapis.com/Camera", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Camera() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Camera copy$default(Camera camera, Dimension dimension, Dimension dimension2, List list, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            dimension = camera.max_resolution;
        }
        if ((i & 2) != 0) {
            dimension2 = camera.default_resolution;
        }
        if ((i & 4) != 0) {
            list = camera.supported_resolutions;
        }
        if ((i & 8) != 0) {
            str = camera.version;
        }
        if ((i & 16) != 0) {
            byteString = camera.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return camera.copy(dimension, dimension2, list2, str, byteString2);
    }

    public final Camera copy(Dimension dimension, Dimension dimension2, List<Dimension> supported_resolutions, String str, ByteString unknownFields) {
        j.g(supported_resolutions, "supported_resolutions");
        j.g(unknownFields, "unknownFields");
        return new Camera(dimension, dimension2, supported_resolutions, str, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera)) {
            return false;
        }
        Camera camera = (Camera) obj;
        return j.b(unknownFields(), camera.unknownFields()) && j.b(this.max_resolution, camera.max_resolution) && j.b(this.default_resolution, camera.default_resolution) && j.b(this.supported_resolutions, camera.supported_resolutions) && j.b(this.version, camera.version);
    }

    public final Dimension getDefault_resolution() {
        return this.default_resolution;
    }

    public final Dimension getMax_resolution() {
        return this.max_resolution;
    }

    public final List<Dimension> getSupported_resolutions() {
        return this.supported_resolutions;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Dimension dimension = this.max_resolution;
        int iHashCode2 = (iHashCode + (dimension != null ? dimension.hashCode() : 0)) * 37;
        Dimension dimension2 = this.default_resolution;
        int iD = AbstractC1414e.d(this.supported_resolutions, (iHashCode2 + (dimension2 != null ? dimension2.hashCode() : 0)) * 37, 37);
        String str = this.version;
        int iHashCode3 = iD + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m6newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.max_resolution != null) {
            arrayList.add("max_resolution=" + this.max_resolution);
        }
        if (this.default_resolution != null) {
            arrayList.add("default_resolution=" + this.default_resolution);
        }
        if (!this.supported_resolutions.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("supported_resolutions="), this.supported_resolutions, arrayList);
        }
        if (this.version != null) {
            AbstractC1414e.p(this.version, new StringBuilder("version="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "Camera{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera(Dimension dimension, Dimension dimension2, List<Dimension> supported_resolutions, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(supported_resolutions, "supported_resolutions");
        j.g(unknownFields, "unknownFields");
        this.max_resolution = dimension;
        this.default_resolution = dimension2;
        this.version = str;
        this.supported_resolutions = Internal.immutableCopyOf("supported_resolutions", supported_resolutions);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m6newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public Camera(Dimension dimension, Dimension dimension2, List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dimension, (i & 2) != 0 ? null : dimension2, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }
}
