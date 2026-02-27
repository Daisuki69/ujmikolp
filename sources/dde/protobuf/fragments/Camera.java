package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.C1385i;
import dg.C1386j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Camera extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.Resolution#ADAPTER", schemaIndex = 1, tag = 2)
    private final Resolution defaultResolution;

    @WireField(adapter = "dde.protobuf.fragments.Resolution#ADAPTER", schemaIndex = 0, tag = 1)
    private final Resolution maxResolution;

    @WireField(adapter = "dde.protobuf.fragments.Resolution#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Resolution> supportedResolutions;
    public static final C1386j Companion = new C1386j();
    public static final ProtoAdapter<Camera> ADAPTER = new C1385i(FieldEncoding.LENGTH_DELIMITED, z.a(Camera.class), "type.googleapis.com/dde.protobuf.fragments.Camera", Syntax.PROTO_3, null, "dde-protobuf/fragments/Camera.proto");

    public Camera() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Camera copy$default(Camera camera, Resolution resolution, Resolution resolution2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            resolution = camera.maxResolution;
        }
        if ((i & 2) != 0) {
            resolution2 = camera.defaultResolution;
        }
        if ((i & 4) != 0) {
            list = camera.supportedResolutions;
        }
        if ((i & 8) != 0) {
            byteString = camera.unknownFields();
        }
        return camera.copy(resolution, resolution2, list, byteString);
    }

    public final Camera copy(Resolution resolution, Resolution resolution2, List<Resolution> supportedResolutions, ByteString unknownFields) {
        j.g(supportedResolutions, "supportedResolutions");
        j.g(unknownFields, "unknownFields");
        return new Camera(resolution, resolution2, supportedResolutions, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera)) {
            return false;
        }
        Camera camera = (Camera) obj;
        return j.b(unknownFields(), camera.unknownFields()) && j.b(this.maxResolution, camera.maxResolution) && j.b(this.defaultResolution, camera.defaultResolution) && j.b(this.supportedResolutions, camera.supportedResolutions);
    }

    public final Resolution getDefaultResolution() {
        return this.defaultResolution;
    }

    public final Resolution getMaxResolution() {
        return this.maxResolution;
    }

    public final List<Resolution> getSupportedResolutions() {
        return this.supportedResolutions;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Resolution resolution = this.maxResolution;
        int iHashCode2 = (iHashCode + (resolution != null ? resolution.hashCode() : 0)) * 37;
        Resolution resolution2 = this.defaultResolution;
        int iHashCode3 = this.supportedResolutions.hashCode() + ((iHashCode2 + (resolution2 != null ? resolution2.hashCode() : 0)) * 37);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m230newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.maxResolution != null) {
            arrayList.add("maxResolution=" + this.maxResolution);
        }
        if (this.defaultResolution != null) {
            arrayList.add("defaultResolution=" + this.defaultResolution);
        }
        if (!this.supportedResolutions.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("supportedResolutions="), this.supportedResolutions, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Camera{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera(Resolution resolution, Resolution resolution2, List<Resolution> supportedResolutions, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(supportedResolutions, "supportedResolutions");
        j.g(unknownFields, "unknownFields");
        this.maxResolution = resolution;
        this.defaultResolution = resolution2;
        this.supportedResolutions = Internal.immutableCopyOf("supportedResolutions", supportedResolutions);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m230newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public Camera(Resolution resolution, Resolution resolution2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resolution, (i & 2) != 0 ? null : resolution2, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }
}
