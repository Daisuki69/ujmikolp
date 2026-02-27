package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class NetFetchState extends YtFSMBaseState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15904b;
    public String c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15905d = "";
    public boolean e = false;
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15906g = "";
    public String h = "";
    public int i = 2;
    public JSONObject j = null;

    public class a extends HashMap<String, Object> {
        public a(NetFetchState netFetchState) {
            put(StateEvent.Name.UI_TIPS, StringCode.NET_FETCH_DATA);
        }
    }

    public class b extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15907a;

        public b(NetFetchState netFetchState, String str) {
            this.f15907a = str;
            put("ui_error", 4194304);
            put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, 4194304);
            put("message", CommonUtils.makeMessageJson(4194304, StringCode.MSG_PARAM_ERROR, str));
        }
    }

    public String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        String[] strArrSplit = str.split("&");
        if (strArrSplit.length > 0) {
            boolean z4 = false;
            boolean z5 = true;
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2.length > 1) {
                    if (strArrSplit2[0].equals("need_action_video")) {
                        if (!strArrSplit2[1].equals("true")) {
                            YtLogger.w("NetFetchState", "Background configuration error！ 'need_action_video' is false,but must has video!!", null);
                        }
                        z4 = true;
                    } else if (z5) {
                        sb2.append(strArrSplit2[0]);
                        sb2.append("=");
                        sb2.append(strArrSplit2[1]);
                        z5 = false;
                    } else {
                        sb2.append("&");
                        sb2.append(strArrSplit2[0]);
                        sb2.append("=");
                        sb2.append(strArrSplit2[1]);
                    }
                }
            }
            if (z4) {
                sb2.append("&need_action_video=true");
            }
        }
        return sb2.toString();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        YtFSM.getInstance().sendFSMEvent(new a(this));
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            String str = YTAGReflectLiveCheckInterface.TAG;
            LiveStyleRequester.SeleceData seleceData = new LiveStyleRequester.SeleceData(-10000.0f);
            this.stateData.put("select_data", seleceData);
            if ((this.c.isEmpty() || !this.e) && this.f15904b != null) {
                YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData = new YtLivenessNetProtoHelper.GetLiveTypeReqData();
                YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
                getLiveTypeReqData.baseInfo = netBaseInfoData;
                netBaseInfoData.appId = this.f15903a;
                netBaseInfoData.businessId = "wx_default";
                netBaseInfoData.lux = seleceData.android_data.lux;
                getLiveTypeReqData.reflectConfig = this.f15906g;
                getLiveTypeReqData.controlConfig = this.h;
                getLiveTypeReqData.colorNum = this.i;
                String strMakeGetLiveTypeReq = YtLivenessNetProtoHelper.makeGetLiveTypeReq(getLiveTypeReqData);
                YtLogger.i("NetFetchState", "Use online data ---> on get config info: " + strMakeGetLiveTypeReq);
                YtFSM.getInstance().sendNetworkRequest(StringCode.NET_FETCH_DATA, this.f15904b, strMakeGetLiveTypeReq, null, new e(this, getLiveTypeReqData));
                return;
            }
            YtLogger.i("NetFetchState", "Use local data");
            this.stateData.put("color_data", this.c);
            this.stateData.put("action_data", this.f15905d);
            YtLogger.d("NetFetchState", "select data:" + this.j);
            JSONObject jSONObject = this.j;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("config")) {
                        this.stateData.put("control_config", this.j.getString("config"));
                    }
                    if (this.j.has("reflect_param")) {
                        this.stateData.put("extra_config", this.j.getString("reflect_param"));
                    }
                    if (this.j.has("change_point_num")) {
                        this.stateData.put("cp_num", this.j.getString("change_point_num"));
                    }
                } catch (JSONException e) {
                    String str2 = "Select data parse failed " + e.getLocalizedMessage();
                    YtLogger.e("NetFetchState", str2, e);
                    YtSDKStats.getInstance().reportInfo(str2);
                }
            } else {
                YtLogger.e("NetFetchState", "select data is null", null);
                YtSDKStats.getInstance().reportInfo("select data is null");
            }
            moveToNextState();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.o("NetFetchState", makeStateInfo("NetFetchState", 1));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        try {
            String string = jSONObject.getString("app_id");
            this.f15903a = string;
            if (string == null) {
                YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
            }
            if (jSONObject.has("config_api_url")) {
                this.f15904b = jSONObject.getString("config_api_url");
            }
            if (jSONObject.has("color_data")) {
                this.c = jSONObject.getString("color_data");
            }
            if (jSONObject.has("local_config_flag")) {
                this.e = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("action_default_seq")) {
                JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f15905d += jSONArray.getString(i);
                    if (i < jSONArray.length() - 1) {
                        this.f15905d += ",";
                    }
                }
            } else {
                this.f15905d = "0";
            }
            if (jSONObject.has("extra_config")) {
                this.f15906g = jSONObject.getString("extra_config");
            } else {
                this.f15906g = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.h = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.i = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("select_data")) {
                this.j = jSONObject.getJSONObject("select_data");
            }
            if (jSONObject.has("backend_proto_type")) {
                jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
            this.f = jSONObject.optBoolean("action_local_config_flag", false);
        } catch (JSONException e) {
            e.printStackTrace();
            YtLogger.e("NetFetchState", "Failed to parse json:", e);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            YtFSM ytFSM = YtFSM.getInstance();
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            if (ytFSM.transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)) == -1) {
                sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName));
                return;
            }
            return;
        }
        String str = "msg_param_error current unknown work mode:" + YtFSM.getInstance().getWorkMode();
        YtSDKStats.getInstance().reportError(4194304, str);
        YtFSM.getInstance().sendFSMEvent(new b(this, str));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
    }
}
