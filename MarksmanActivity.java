package com.renz.Patcher;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.mig35.carousellayoutmanager.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import com.bumptech.glide.Glide;
import com.gdacciaro.iOSDialog.*;
import com.kaopiz.kprogresshud.*;
import com.sdsmdg.tastytoast.*;
import com.shashank.sony.fancytoastlib.*;
import java.io.*;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import yanzhikai.textpath.*;
import java.io.*;
import androidx.documentfile.provider.DocumentFile;
import java.util.zip.*;
import android.database.*;
import android.provider.DocumentsContract;
import android.provider.DocumentsContract.Document;

public class MarksmanActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private HashMap<String, Object> map = new HashMap<>();
	private String files = "";
	private String Npath1 = "";
	private String Npath = "";
	private  Uri urit;
	private  Uri muri;
	private  DocumentFile f3;
	private  DocumentFile f4;
	private  DocumentFile path;
	private  DocumentFile path1;
	private  DocumentFile file1;
	private  DocumentFile file2;
	private  static final int NEW_FOLDER_REQUEST_CODE = 43;
	private  DocumentFile filepath;
	private  Uri suri;
	private double hd = 0;
	private String placementId = "";
	private String unityGameID = "";
	private boolean testMode = false;
	private String msg = "";
	private boolean heart = false;
	private double n1 = 0;
	private String sh = "";
	
	private ArrayList<HashMap<String, Object>> map1 = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear36;
	private LinearLayout linear38;
	private LinearLayout linear22;
	private LinearLayout linear29;
	private LinearLayout linear2;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear32;
	private ImageView imageview19;
	private TextView textview3;
	private LinearLayout linear30;
	private ImageView imageview23;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear13;
	private LinearLayout linear21;
	private ImageView imageview1;
	private ImageView imageview2;
	private LinearLayout linear23;
	private LinearLayout linear25;
	private LinearLayout linear31;
	private TextView textview1;
	private TextView textview2;
	private ImageView imageview25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private ImageView imageview20;
	private TextView textview4;
	private ImageView imageview21;
	private TextView textview5;
	private ImageView imageview22;
	private TextView textview6;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imageview7;
	private ImageView imageview8;
	private ImageView imageview9;
	private ImageView imageview10;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private ImageView imageview11;
	private ImageView imageview12;
	private ImageView imageview13;
	private ImageView imageview14;
	private ImageView imageview15;
	private ImageView imageview16;
	private ImageView imageview17;
	private ImageView imageview18;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private ImageView imageview26;
	private ImageView imageview27;
	private ImageView imageview28;
	private ImageView imageview29;
	private TextView textview7;
	private TextView textview8;
	
	private AlertDialog.Builder d;
	private Intent i = new Intent();
	private SharedPreferences sp;
	private TimerTask t;
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.marksman);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear36 = findViewById(R.id.linear36);
		linear38 = findViewById(R.id.linear38);
		linear22 = findViewById(R.id.linear22);
		linear29 = findViewById(R.id.linear29);
		linear2 = findViewById(R.id.linear2);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		linear32 = findViewById(R.id.linear32);
		imageview19 = findViewById(R.id.imageview19);
		textview3 = findViewById(R.id.textview3);
		linear30 = findViewById(R.id.linear30);
		imageview23 = findViewById(R.id.imageview23);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear13 = findViewById(R.id.linear13);
		linear21 = findViewById(R.id.linear21);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		linear23 = findViewById(R.id.linear23);
		linear25 = findViewById(R.id.linear25);
		linear31 = findViewById(R.id.linear31);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		imageview25 = findViewById(R.id.imageview25);
		linear26 = findViewById(R.id.linear26);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		imageview20 = findViewById(R.id.imageview20);
		textview4 = findViewById(R.id.textview4);
		imageview21 = findViewById(R.id.imageview21);
		textview5 = findViewById(R.id.textview5);
		imageview22 = findViewById(R.id.imageview22);
		textview6 = findViewById(R.id.textview6);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		imageview3 = findViewById(R.id.imageview3);
		imageview4 = findViewById(R.id.imageview4);
		imageview5 = findViewById(R.id.imageview5);
		imageview6 = findViewById(R.id.imageview6);
		imageview7 = findViewById(R.id.imageview7);
		imageview8 = findViewById(R.id.imageview8);
		imageview9 = findViewById(R.id.imageview9);
		imageview10 = findViewById(R.id.imageview10);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		imageview11 = findViewById(R.id.imageview11);
		imageview12 = findViewById(R.id.imageview12);
		imageview13 = findViewById(R.id.imageview13);
		imageview14 = findViewById(R.id.imageview14);
		imageview15 = findViewById(R.id.imageview15);
		imageview16 = findViewById(R.id.imageview16);
		imageview17 = findViewById(R.id.imageview17);
		imageview18 = findViewById(R.id.imageview18);
		linear33 = findViewById(R.id.linear33);
		linear34 = findViewById(R.id.linear34);
		linear35 = findViewById(R.id.linear35);
		imageview26 = findViewById(R.id.imageview26);
		imageview27 = findViewById(R.id.imageview27);
		imageview28 = findViewById(R.id.imageview28);
		imageview29 = findViewById(R.id.imageview29);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		d = new AlertDialog.Builder(this);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sp.edit().putString("i1", "").commit();
				sp.edit().putString("i2", "").commit();
				sp.edit().putString("i3", "").commit();
				sp.edit().putString("i4", "").commit();
				sp.edit().putString("i5", "").commit();
				sp.edit().putString("i6", "").commit();
				sp.edit().putString("i7", "").commit();
				sp.edit().putString("i8", "").commit();
				sp.edit().putString("i9", "").commit();
				sp.edit().putString("i10", "").commit();
				sp.edit().putString("i11", "").commit();
				sp.edit().putString("l1", "").commit();
				sp.edit().putString("l2", "").commit();
				sp.edit().putString("l3", "").commit();
				sp.edit().putString("l4", "").commit();
				sp.edit().putString("l5", "").commit();
				sp.edit().putString("l6", "").commit();
				sp.edit().putString("l7", "").commit();
				sp.edit().putString("l8", "").commit();
				sp.edit().putString("l9", "").commit();
				sp.edit().putString("l10", "").commit();
				sp.edit().putString("l11", "").commit();
				sp.edit().putString("s1", "").commit();
				sp.edit().putString("s2", "").commit();
				sp.edit().putString("s3", "").commit();
				sp.edit().putString("s4", "").commit();
				sp.edit().putString("s5", "").commit();
				sp.edit().putString("s6", "").commit();
				sp.edit().putString("s7", "").commit();
				sp.edit().putString("s8", "").commit();
				sp.edit().putString("s9", "").commit();
				sp.edit().putString("s10", "").commit();
				sp.edit().putString("s11", "").commit();
				startActivity(new Intent(MarksmanActivity.this, RoleActivity.class)); Animatoo.animateCard(MarksmanActivity.this);
				finish();
			}
		});
		
		linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s1", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s1", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (heart) {
					imageview21.setImageResource(R.drawable.ic_favorite_white);
					heart = false;
				}
				else {
					imageview21.setImageResource(R.drawable.ic_favorite_outline_white);
					heart = true;
				}
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://youtube.com/@renz7387"));
				startActivity(i);
			}
		});
		
		linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sh = "https://youtube.com/@renz7387";
				Intent i = new Intent(android.content.Intent.ACTION_SEND);i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT,sh); startActivity(Intent.createChooser(i,"sh using"));
			}
		});
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s2", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s2", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s3", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s3", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s4", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s4", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s5", "").equals("")) {
					_inject(sp.getString("s5", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s6", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s6", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s7", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s7", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s8", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s8", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s9", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s9", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s10", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s10", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
		
		linear35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!sp.getString("s11", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), sp.getString("s11", ""));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Coming soon!!");
				}
			}
		});
	}
	
	private void initializeLogic() {
		
		if (!sp.getString("perm", "").equals("granted")) {
			try {
				muri = Uri.parse(CyberFilterPro());
				    file2 = DocumentFile.fromTreeUri(MarksmanActivity.this, muri);
				                    
				if (!file2.canRead() || !file2.canWrite()) {
					_perm_huawei(linear1);
				}
				else {
					
				}
			} catch (Exception e) {
				 
			}
		}
		
		//UnityAds.initialize (this, "5233606", false);
		_ClickAnimation(true, 15, linear26);
		_FadForyou(linear4, 200, 400);
		_FadForyou(linear5, 200, 600);
		_FadForyou(linear6, 200, 800);
		_FadForyou(linear7, 200, 1000);
		_FadForyou(linear9, 200, 1200);
		_FadForyou(linear10, 200, 1400);
		_FadForyou(linear11, 200, 1600);
		_FadForyou(linear12, 200, 1800);
		_FadForyou(linear34, 200, 2000);
		_FadForyou(linear35, 200, 2200);
		heart = true;
		if (sp.getString("t", "").equals("")) {
			sp.edit().putString("t", "y").commit();
			_click_Target(imageview23, "Shortcut", "Click this if you want to play MLBB", "#F44336");
		}
		Glide.with(getApplicationContext())
		.load("https://github.com/lanz132/Img/raw/main/20230820_030714.gif")
		.placeholder(R.drawable.loadingpic01)
		.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(1))
		.into(imageview25);
		textview3.setText(sp.getString("role", ""));
		linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF1DE9B6));
		linear15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF1DE9B6));
		linear32.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF1DE9B6));
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF111D37));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF111D37));
		linear18.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF1DE9B6));
		linear19.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF111D37));
		linear33.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF111D37));
		textview1.setText("Hero - ".concat(sp.getString("name", "")));
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 1);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 1);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 1);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		if (!sp.getString("i1", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i1", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview1);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l1", ""))).into(imageview2);
		}
		if (!sp.getString("i2", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i2", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview3);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l2", ""))).into(imageview4);
			textview2.setText("1 available skin");
		}
		if (!sp.getString("i3", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i3", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview5);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l3", ""))).into(imageview6);
			textview2.setText("2 available skins");
		}
		else {
			linear5.setVisibility(View.GONE);
		}
		if (!sp.getString("i4", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i4", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview7);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l4", ""))).into(imageview8);
			textview2.setText("3 available skins");
		}
		else {
			linear6.setVisibility(View.GONE);
		}
		if (!sp.getString("i5", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i5", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview9);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l5", ""))).into(imageview10);
			textview2.setText("4 available skins");
		}
		else {
			linear15.setVisibility(View.GONE);
			linear32.setVisibility(View.GONE);
		}
		if (!sp.getString("i6", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i6", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview11);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l6", ""))).into(imageview12);
			textview2.setText("5 available skins");
		}
		else {
			linear9.setVisibility(View.GONE);
		}
		if (!sp.getString("i7", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i7", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview13);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l7", ""))).into(imageview14);
			textview2.setText("6 available skins");
		}
		else {
			linear10.setVisibility(View.GONE);
		}
		if (!sp.getString("i8", "").equals("")) {
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l8", ""))).into(imageview16);
			Glide.with(getApplicationContext())
			.load(sp.getString("i8", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview15);
			textview2.setText("7 available skins");
		}
		else {
			linear11.setVisibility(View.GONE);
		}
		if (!sp.getString("i9", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i9", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview17);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l9", ""))).into(imageview18);
			textview2.setText("8 available skins");
		}
		else {
			linear12.setVisibility(View.GONE);
		}
		if (!sp.getString("i10", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i10", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview26);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l10", ""))).into(imageview27);
			textview2.setText("9 available skins");
		}
		else {
			linear32.setVisibility(View.GONE);
		}
		if (!sp.getString("i11", "").equals("")) {
			Glide.with(getApplicationContext())
			.load(sp.getString("i11", ""))
			.placeholder(R.drawable.load)
			.transform(new com.bumptech.glide.load.resource.bitmap.RoundedCorners(15))
			.into(imageview28);
			Glide.with(getApplicationContext()).load(Uri.parse(sp.getString("l11", ""))).into(imageview29);
			textview2.setText("10 available skins");
		}
		else {
			linear35.setVisibility(View.GONE);
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		    if (_resultCode == Activity.RESULT_OK) {
				            if (_data != null) {
						               muri = _data.getData();
						if (Uri.decode(muri.toString()).endsWith(":")) {
								
						}
						else {
								final int takeFlags = i.getFlags()
								            & (Intent.FLAG_GRANT_READ_URI_PERMISSION
								            | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
								// Check for the freshest data.
								getContentResolver().takePersistableUriPermission(muri, takeFlags);
								sp.edit().putString("FOLDER_URI", muri.toString()).commit();
								    file1 = DocumentFile.fromTreeUri(this, muri);
								                    
								    file2 = file1.createFile("*/*", "Lansord.nix");
								    urit = file2.getUri();
								sp.edit().putString("D_URI", urit.toString().replace("Lansord.nix", "")).commit();
								try{
										        DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), urit);
										    sp.edit().putString("perm", "granted").commit();
										SketchwareUtil.showMessage(getApplicationContext(), "Granted");
										        } catch (FileNotFoundException e) {
										         
										    }             
						}
						       } else {
						        
						   }
				       } else {
				       recreate();
				   }
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	
	@Override
	public void onBackPressed() {
		sp.edit().putString("i1", "").commit();
		sp.edit().putString("i2", "").commit();
		sp.edit().putString("i3", "").commit();
		sp.edit().putString("i4", "").commit();
		sp.edit().putString("i5", "").commit();
		sp.edit().putString("i6", "").commit();
		sp.edit().putString("i7", "").commit();
		sp.edit().putString("i8", "").commit();
		sp.edit().putString("i9", "").commit();
		sp.edit().putString("i10", "").commit();
		sp.edit().putString("i11", "").commit();
		sp.edit().putString("l1", "").commit();
		sp.edit().putString("l2", "").commit();
		sp.edit().putString("l3", "").commit();
		sp.edit().putString("l4", "").commit();
		sp.edit().putString("l5", "").commit();
		sp.edit().putString("l6", "").commit();
		sp.edit().putString("l7", "").commit();
		sp.edit().putString("l8", "").commit();
		sp.edit().putString("l9", "").commit();
		sp.edit().putString("l10", "").commit();
		sp.edit().putString("l11", "").commit();
		sp.edit().putString("s1", "").commit();
		sp.edit().putString("s2", "").commit();
		sp.edit().putString("s3", "").commit();
		sp.edit().putString("s4", "").commit();
		sp.edit().putString("s5", "").commit();
		sp.edit().putString("s6", "").commit();
		sp.edit().putString("s7", "").commit();
		sp.edit().putString("s8", "").commit();
		sp.edit().putString("s9", "").commit();
		sp.edit().putString("s10", "").commit();
		sp.edit().putString("s11", "").commit();
		startActivity(new Intent(MarksmanActivity.this, RoleActivity.class)); Animatoo.animateCard(MarksmanActivity.this);
		finish();
	}
	public void _add(final String _img, final String _scrip, final double _pos) {
		map.put("i".concat(String.valueOf((long)(_pos))), _img);
		map.put("s".concat(String.valueOf((long)(_pos))), _scrip);
	}
	
	
	public void _skin() {
		map = new HashMap<>();
		map.put("name", "moscov");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5O98m_NJLdmLGpuxBSVw_kY0nNJxW_r_5kQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/MOSCOV%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKI6gJFTm0MWb_Z41pUPL5E94Q0dh-hLXMWA&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/MOSCOV%20STARLIGHT1.zip", 2);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQimn8MO8NqTW3lhvKhKO9nvuTPIhvu2JYa_Q&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/MOSCOV%20ABYSS.zip", 3);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHiKqrUreMW6XsyeCjfSm2SqveXEWbkojTqQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/MOSCOV%20EPICRED.zip", 4);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWFCT9MNGYBbKDR5ehWVwNgG1S-HltHOOgMA&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/MOSCOV%20EPICVIOLET.zip", 5);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT_Hjmw__z6H8Wo5I7ohetkTc7gmcnBaG_Sw&usqp=CAU", "\nhttps://github.com/Renier012/Marksman-/blob/main/MOSCOV%20STARLIGHT2.zip", 6);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "claude ");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqqUp071Av9-bG5JLl_H0HXywX722sN9WHpQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/CLAUDE%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwmqAzUhW8-wmYyxl-mLhoBjQfM6ZhKGltmg&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/CLAUDE%20CHRISTMAS.zip", 2);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgNEmCf8lPek8X7myZN00c5QyXsUzAQfUQvw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/CLAUDE%20BADBRO.zip", 3);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3M40ZiedgsZj8q5jEo8HfWGNxS2dRsBa_Pw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/CLAUDE%20BLAZING.zip", 4);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNqg5RRWEC1v1_K66R07jY1JSkac0X6Hs1IQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/CLAUDE%20METCHADRAGON.zip", 5);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "granger ");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvW_ZbRvwFNmqpox6bhj-En31gfXHgFr9N6Q&usqp=CAU", "https://github.com/Renier012/Marksman-/raw/main/GRANGER%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWXVQk-gZepHuCKC4lF1bjzXqAqWPihXsEGQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/GRANGER%20AGENTZ.zip", 2);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSJirTb-5rf8IB4tLg-fvZHl4PsRpRavXthg&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/GRANGER%20STARLIGHT.zip", 3);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqw3AHIKJVnL9DLQ5wtqCJkngAxyT2_FzGqA&usqp=CAU", "\nhttps://github.com/Renier012/Marksman-/blob/main/GRANGER%20LIGHTBORN.zip", 4);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdthzlXQkuSRjnbaySXTSqZiY4svciqnbcew&usqp=CAU", "\nhttps://github.com/Renier012/Marksman-/blob/main/GRANGER%20LEGEND.zip", 5);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "bruno");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRC-Rv5-Cq47qA3DKfvI4a7NrxPiurxqlpXnw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRUNO%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQX5A6ZtwcuieeSKFTx8yYz_NdvNJCm756Sjw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRUNO%20ELITE1.zip", 2);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOxbGT5uUG_dqGe1nn44XVgVZuL3O6mcWeqw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRUNO%20ELITE2.zip", 3);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRzEUlkqwOt6QlebvsX3MCXkN7rSxDlK8CUg&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRUNO%20SPECIAL.zip", 4);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxH088G7My1Szkl7ImZ7SR0n2pZ5QzFSCFJQ&usqp=CAU", "\nhttps://github.com/Renier012/Marksman-/blob/main/BRUNO%20HERO.zip", 5);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "brody");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgtgdQ2C_lcvT2xWbTk09QJpTjxefKEhR9Pw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRODY%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-WU-FN58-AdgwclJR1BZ-wSQgVpeqWbWD5g&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRODY%20NORMAL.zip", 2);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTValTRiiGLkwJmDWBcxIKqwUsbTSKaEiHA9Q&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRODY%20STARLIGHT.zip", 3);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTpADnmrZgwThPH1hxsQTIUuBExGnixEDhkg&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRODY%20COLLECTOR.zip", 4);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiVdnMbGyKob4bPS2UU0H443GBEMwuh3TvvQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/BRODY%20STUN.zip", 5);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "clint");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShkEs0yLQzkX1E24AiYn1C3FJ0E3zn1UhssQ&usqp=CAU", "\nhttps://github.com/Renier012/Marksman-/blob/main/CLINT%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGwYy7lR5E9J1PRftQuB8qpbpYjIw9-Tqpww&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/FLINT%20COLLECTOR.zip", 2);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "hanabi");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsAQcJ-wK3uf1Bw0kUu_CVYTg7jUezHDAfpw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/HANABI%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTKpdESVXrkrlopL6KrCWH7IDkDi2wH62_Zw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/HANABI%20ABYSS.zip", 2);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "wanwan");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRI2e9stpa3H2vnDVv9NeM8YQ3hkecrC32KJw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/WANWAN%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUXuQIFIzp-sOPaU8yq8-PJYSItBzduXQxDQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/WANWAN%20COLLECTOR.zip", 2);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "yss");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMu6lNMj-19vEWGRjdRyCMlPmms1UKyW7w2g&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/YSS%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4E0YCbc5xlJq0Td92H-uDfqEcWfWj1GchFg&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/YSS%20COLLECTOR.zip", 2);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "kimmy");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXmy3aYpWTprxxU2hjimT5C6e39K6wxuTarQ&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/KIMMY%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrvkLUSYhpY4kOfSU11qBPZKkACqLIveBJEg&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/KIMMY%20STARWARS.zip", 2);
		map1.add(map);
		map = new HashMap<>();
		map.put("name", "mellisa");
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIP7yCQ0m1C9irbq9dWntEJCaKUA0oKv5qyw&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/MELLISA%20BACKUP.zip", 1);
		_add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZou921dgsQk_hv_LaCseahiOhLPpXCuYN-g&usqp=CAU", "https://github.com/Renier012/Marksman-/blob/main/MELLISA%20JOJU.zip", 2);
		map1.add(map);
	}
	
	
	public void _AutoDefault() {
	}
	private class HUDTask extends AsyncTask<String, Integer, String> {
		KProgressHUD hd;
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			hd = new KProgressHUD(MarksmanActivity.this).setStyle(KProgressHUD.Style.BAR_DETERMINATE).setLabel("RENZ")
			.setMaxProgress(100);
			SketchwareUtil.showMessage(getApplicationContext(), "Make sure on your data or wifi");
			hd.show();
			
		}
		String filename = "";
		String result = "";
		double size = 0;
		double sumCount = 0;
		
		@Override
		protected String doInBackground(String... address) {
			try {
				filename= URLUtil.guessFileName(address[0], null, null);
				int resCode = -1;
				java.io.InputStream in = null;
				java.net.URL url = new java.net.URL(address[0]);
				java.net.URLConnection urlConn = url.openConnection();
				if (!(urlConn instanceof java.net.HttpURLConnection)) {
					throw new java.io.IOException("URL is not an Http URL"); }
				java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) urlConn; httpConn.setAllowUserInteraction(false); httpConn.setInstanceFollowRedirects(true); httpConn.setRequestMethod("GET"); httpConn.connect();
				resCode = httpConn.getResponseCode();
				if (resCode == java.net.HttpURLConnection.HTTP_OK) {
					in = httpConn.getInputStream();
					size = httpConn.getContentLength();
					
				} else { result = "There was an error"; }
				/**/
				if (sp.getString("EMUI", "").equals("EMUI")) {
					Npath1 = FileUtil.getExternalStorageDir().concat("/Android/data/com.mobilelegends.hwag/files/dragon2017/assets/");
					Npath = FileUtil.getExternalStorageDir().concat("/Android/data/com.mobilelegends.hwag/files/dragon2017/assets/".concat(filename));
				}
				else {
					Npath1 = FileUtil.getExternalStorageDir().concat("/Android/data/com.mobile.legends/files/dragon2017/assets/");
					Npath = FileUtil.getExternalStorageDir().concat("/Android/data/com.mobile.legends/files/dragon2017/assets/".concat(filename));
				}
				java.io.File file = new java.io.File(Npath);
				
				java.io.OutputStream output = new java.io.FileOutputStream(file);
				try {
					int bytesRead;
					sumCount = 0;
					byte[] buffer = new byte[1024];
					while ((bytesRead = in.read(buffer)) != -1) {
						output.write(buffer, 0, bytesRead);
						sumCount += bytesRead;
						if (size > 0) {
							publishProgress((int)Math.round(sumCount*100 / size));
						}
					}
				} finally {
					output.close();
				}
				result ="";
				in.close();
			} catch (java.net.MalformedURLException e) {
				result = e.getMessage();
			} catch (java.io.IOException e) {
				result = e.getMessage();
			} catch (Exception e) {
				result = e.toString();
			}
			return result;
			
		}
		@Override
		protected void onProgressUpdate(Integer... values) {
			super.onProgressUpdate(values);
			hd.setProgress(values[values.length - 1]);
			hd.setDetailsLabel(String.valueOf((long)(values[values.length - 1])).concat("% Injecting"));
		}
		@Override
		protected void onPostExecute(String s){
			
		/*	IUnityAdsListener rewardedListner = new IUnityAdsListener() {
					     @Override
					  public void onUnityAdsReady(String s) {
							     
							   }
					  @Override
					  public void onUnityAdsStart(String s) {
							     
							  }
					  
					 @Override
					 public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {
							   if (finishState.equals(UnityAds.FinishState.COMPLETED)) {
									
							}
							if (finishState == UnityAds.FinishState.SKIPPED) {
									
							}
							if (finishState == UnityAds.FinishState.ERROR) {
									
							}
							 }  
					@Override
					public void onUnityAdsError(UnityAds.UnityAdsError error, String message) {
							 
					}
			};
			UnityAds.setListener(rewardedListner);
			UnityAds.load("Interstitial_Android");
			
			if (UnityAds.isReady("Interstitial_Android")) {
							UnityAds.show(MarksmanActivity.this, "Interstitial_Android");
			}*/
			if (CyberUnzip(Npath1,Npath)) {
				FileUtil.deleteFile(Npath);
				TastyToast.makeText(getApplicationContext(), "Inject Success!", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
			}
			else {
				TastyToast.makeText(getApplicationContext(), "Error!", TastyToast.LENGTH_LONG, TastyToast.ERROR);
			}
		}
	}
	
	
	public void _permision(final View _view) {
		i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
		i.setAction(Intent.ACTION_OPEN_DOCUMENT_TREE);
		muri = Uri.parse("content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3AAndroid%2Fdata%2Fcom.mobile.legends%2Ffiles%2Fdragon2017%2Fassets");
		    i.putExtra(DocumentsContract.EXTRA_INITIAL_URI, muri);
		        startActivityForResult(i, NEW_FOLDER_REQUEST_CODE);
	}
	
	
	public void _xtra() {
	}
	
	Boolean CyberAlphaUnzip (DocumentFile srcZipFile, DocumentFile destDir) {
		
		try {
			
			ZipEntry entry; 
			InputStream inputStream = getContentResolver().openInputStream(srcZipFile.getUri()); 
			
			BufferedInputStream bis = new BufferedInputStream(inputStream);
			
			java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(bis);
			
			
			 
			while ((entry = zipInputStream.getNextEntry()) != null) { 
				DocumentFile currentDestDir = destDir; 
				DocumentFile parentDir = destDir; 
				DocumentFile childDir = null;
				
				if (entry.toString().endsWith("/")) { 
					
					String[] tempStr = entry.toString().split("/"); 
					
					
					 for (String st : tempStr) { 
						
						String meta = Arrays.toString(tempStr);
						if(meta == "Ui"){
							childDir = parentDir.findFile(meta.toUpperCase());
						}else{
							childDir = parentDir.findFile(st);
						}
						
						 if (childDir == null) { 
							
							childDir = parentDir.createDirectory(st);
							//swtchend
						} 
						parentDir = childDir; 
					} 
					// returns null 
				}
				
				else if (entry.toString().contains("/")) { 
					
					String[] tempStr = entry.toString().split("/"); 
					
					for (int i = 0; i < tempStr.length - 1; i++) { 
						
						childDir = parentDir.findFile(tempStr[i]); 
						
						if (childDir == null){ 
							childDir = parentDir.createDirectory(tempStr[i]); } 
						parentDir = childDir; 
					} 
					String finalFileName = entry.toString().substring(entry.toString().lastIndexOf("/") + 1); 
					
					unzipFile(entry, zipInputStream, parentDir);
					
					
					 } // Like ---> / 
				else if (entry.toString().equals("/")) 
				{
					 
					 } else { 
					unzipFile(entry, zipInputStream, destDir);
					
					
				}
			}
			inputStream.close(); 
			 }catch(IOException e1){
			//toast
			SketchwareUtil.showMessage(getApplicationContext(), e1.toString());
			return false;
			 } 
		return true;
		
	} 
	private void unzipFile(ZipEntry fileEntry, java.util.zip.ZipInputStream zipInputStream, DocumentFile finalDir) throws IOException {
		 int readLen; 
		
		if (!fileEntry.isDirectory()) {
			DocumentFile tempFile = null;
			DocumentFile df = null;
											
											
											//Now you have to tell it what file extensions ("MIME" type) you want to use, e.g.:
			
			
			tempFile = DocumentFile.fromSingleUri(this, Uri.parse(finalDir.getUri().toString().concat(Uri.encode("/").concat(Uri.parse(fileEntry.toString()).getLastPathSegment()))));
			
			
			if (tempFile.exists()) {
				
				df = tempFile;
					
			}else {
				
				df = finalDir.createFile("*/*",  Uri.parse(fileEntry.toString()).getLastPathSegment());
			}
				
			try {
				
				OutputStream out = getContentResolver().openOutputStream(df.getUri());
												BufferedOutputStream bos = new BufferedOutputStream(out);
				long zipfilesize = fileEntry.getSize();
				
				byte[] buffer = new byte[4096];
												int len = 0;
												int totlen = 0;
				
				int count = -1;
				while ((count = zipInputStream.read(buffer)) != -1)
				{
					out.write(buffer, 0, count);
				}
				out.close(); 
				bos.close();
				
				 }catch(Exception e2){
				//toast
				SketchwareUtil.showMessage(getApplicationContext(), e2.toString());
				
			}
			
		}
		 }
	
	{
	}
	boolean hasManageExternalStoragePermission() 
	{
		 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) { 
			if (Environment.isExternalStorageManager()) {
				 return true;
				 } else {
				 if (Environment.isExternalStorageLegacy()) { return true; 
				} 
				try { 
					Intent intent = new Intent(); intent.setAction(android.provider.Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION); intent.setData(Uri.parse("package:".concat(getApplicationContext().getPackageName().toString())
					)); 
					startActivityForResult(intent, 1);
					  
					return false; 
				} catch (Exception e) { 
					return false; 
				}
				 }
			 } 
		{
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) { 
				if (Environment.isExternalStorageLegacy()) { 
					return true;
					 } else {
					 try { 
						Intent intent = new Intent(); intent.setAction(android.provider.Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION); intent.setData(Uri.parse("package:".concat(getApplicationContext().getPackageName().toString())
						)); 
						startActivityForResult(intent, 1); 
						
						return false;
						 } catch (Exception e) { 
						return true; 
					} 
				} 
			}
			 return true; 
		}
	}
	Boolean CyberUnzip(String destDir,String fileZip){
		try
		{
			java.io.File outdir = new java.io.File(destDir);
			java.util.zip.ZipInputStream zin = new java.util.zip.ZipInputStream(new java.io.FileInputStream(fileZip));
			java.util.zip.ZipEntry entry;
			String name, dir;
			while ((entry = zin.getNextEntry()) != null)
			{
				name = entry.getName();
				if(entry.isDirectory())
				{
					mkdirs(outdir, name);
					continue;
				}
				
				/* this part is necessary because file entry can come before
* directory entry where is file located
* i.e.:
* /foo/foo.txt
* /foo/
*/
				
				dir = dirpart(name);
				if(dir != null)
				mkdirs(outdir, dir);
				
				extractFile(zin, outdir, name);
			}
			zin.close();
		}
		catch (java.io.IOException e)
		{
			return false;
		}
		return true;
		
	}
	private static void extractFile(java.util.zip.ZipInputStream in, java.io.File outdir, String name) throws java.io.IOException
	{
		byte[] buffer = new byte[4096];
		java.io.BufferedOutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(outdir, name)));
		int count = -1;
		while ((count = in.read(buffer)) != -1)
		out.write(buffer, 0, count);
		out.close();
	}
	
	private static void mkdirs(java.io.File outdir, String path)
	{
		java.io.File d = new java.io.File(outdir, path);
		if(!d.exists())
		d.mkdirs();
	}
	
	private static String dirpart(String name)
	{
		int s = name.lastIndexOf(java.io.File.separatorChar);
		return s == -1 ? null : name.substring(0, s);
	}
	{
	}
	
	
	public void _unzip() {
	}
	private class Decompress extends AsyncTask<Void, Integer, Integer> { 
		DocumentFile srcZipFile;
		DocumentFile destDir;
		Context ctx;
		int result = 0;
		
		final AlertDialog.Builder sgg = new AlertDialog.Builder(MarksmanActivity.this);
		final AlertDialog ODialog = sgg.create();
		final View inflate = getLayoutInflater().inflate(R.layout.ext, null);
		ProgressBar pb1 = inflate.findViewById(R.id.progressbar1);
		TextView texter = inflate.findViewById(R.id.textviewer);
		
		
		public Decompress(DocumentFile srcZipFile, DocumentFile destDir, Context ctx) {
			super();		
			this.srcZipFile = srcZipFile; 		
			this.destDir = destDir;		
			this.ctx = ctx;
		}
		
		@Override	protected void onPreExecute() {
			
			LinearLayout linear = (LinearLayout)inflate.findViewById(R.id.linear1);
			
			linear.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b, int c) { this.setCornerRadius(a); this.setColor(b); this.setStroke(c, Color.parseColor("#ffffffff")); return this; } }.getIns((int)30, 0xFF212121,0));
			
			
			if (android.os.Build.VERSION.SDK_INT >= 21) {
				
				pb1.getIndeterminateDrawable().setColorFilter(0xFF1F75BE, PorterDuff.Mode.SRC_IN);
				
			}
			ODialog.setView(inflate);
			ODialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
			ODialog.setCancelable(false);
			ODialog.show();
		}
		@Override
		protected Integer doInBackground(Void... params){		
			int count = 0;
			
			
			try {
				ZipEntry entry; 
				InputStream inputStream = getContentResolver().openInputStream(srcZipFile.getUri()); 
				
				BufferedInputStream bis = new BufferedInputStream(inputStream);
				
				java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(bis);
				
				int numFiles = 0;
				
				 
				
				
				while ((entry = zipInputStream.getNextEntry()) != null) { 
					DocumentFile currentDestDir = destDir; 
					DocumentFile parentDir = destDir; 
					DocumentFile childDir = null;
					count++;
					publishProgress((int)count);
					
					if (entry.toString().endsWith("/")) { 
						
						String[] tempStr = entry.toString().split("/"); 
						
						
						 for (String st : tempStr) { 
							
							if (st.equals("UI")){
								childDir = parentDir.findFile(st.toUpperCase());
								
								if (childDir == null) { 
									childDir = parentDir.createDirectory(st);
								}
								
							}else{
								childDir = parentDir.findFile(st);
								
								if (childDir == null) { 
									childDir = parentDir.createDirectory(st);
								}
								
							}
							 
							parentDir = childDir; 
						} 
						// returns null 
					}
					
					else if (entry.toString().contains("/")) { 
						
						String[] tempStr = entry.toString().split("/"); 
						
						for (int i = 0; i < tempStr.length - 1; i++) { 
							
							childDir = parentDir.findFile(tempStr[i]); 
							
							if (childDir == null){ 
								childDir = parentDir.createDirectory(tempStr[i]); } 
							parentDir = childDir; 
						} 
						String finalFileName = entry.toString().substring(entry.toString().lastIndexOf("/") + 1); 
						
						unzipFile(entry, zipInputStream, parentDir);
						
						
						 } // Like ---> / 
					else if (entry.toString().equals("/")) 
					{
						 
						 } else { 
						unzipFile(entry, zipInputStream, destDir);
						
						
					}
				}
				inputStream.close(); 
				 }catch(IOException e1){
				//toast
				final String e11 = e1.toString();
				runOnUiThread(new Runnable() { 
					public void run() { 
						SketchwareUtil.showMessage(getApplicationContext(), e11);
					} });
				 } 
			
			return result;
		} 
		private void unzipFile(ZipEntry fileEntry, java.util.zip.ZipInputStream zipInputStream, DocumentFile finalDir) throws IOException {
    if (!fileEntry.isDirectory()) {
        // Handle files
        String fileName = fileEntry.getName();
        DocumentFile df = finalDir.createFile("*/*", fileName);

        try {
            OutputStream out = getContentResolver().openOutputStream(df.getUri());
            BufferedOutputStream bos = new BufferedOutputStream(out);
            byte[] buffer = new byte[4096];
            int count;
            while ((count = zipInputStream.read(buffer)) != -1) {
                bos.write(buffer, 0, count);
            }
            bos.close();
        } catch (Exception e2) {
            // Handle exceptions for file extraction
            final String e22 = e2.toString();
            runOnUiThread(new Runnable() {
                public void run() {
                    SketchwareUtil.showMessage(getApplicationContext(), e22);
                }
            });
        }
    } else {
        // Handle directories
        String dirName = fileEntry.getName();
        DocumentFile childDir = finalDir.findFile(dirName);

        if (childDir == null) {
            childDir = finalDir.createDirectory(dirName);
        }

        // You can recursively unzip the contents of the directory here if needed.
    }
}
		protected void onProgressUpdate(Integer... progress) {	
				
			texter.setText(String.valueOf(progress[progress.length - 1]).concat(" Files Extracted..."));
		}
		@Override
		protected void onPostExecute(Integer result) {
			ODialog.dismiss();
			suri = Uri.parse(sp.getString("D_URI", "").concat(files.toLowerCase())); 
			filepath = DocumentFile.fromTreeUri(MarksmanActivity.this, suri);
			if (suri.toString().endsWith(".zip")) {
				try{
					        DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), suri);
					    runOnUiThread(new Runnable() { 
						public void run() { 
							TastyToast.makeText(getApplicationContext(), "Inject Success!", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
						/*	IUnityAdsListener rewardedListner = new IUnityAdsListener() {
									     @Override
									  public void onUnityAdsReady(String s) {
											     
											   }
									  @Override
									  public void onUnityAdsStart(String s) {
											     
											  }
									  
									 @Override
									 public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {
											   if (finishState.equals(UnityAds.FinishState.COMPLETED)) {
													
											}
											if (finishState == UnityAds.FinishState.SKIPPED) {
													
											}
											if (finishState == UnityAds.FinishState.ERROR) {
													
											}
											 }  
									@Override
									public void onUnityAdsError(UnityAds.UnityAdsError error, String message) {
											 
									}
							};
							UnityAds.setListener(rewardedListner);
							UnityAds.load("Interstitial_Android");
							
							if (UnityAds.isReady("Interstitial_Android")) {
											UnityAds.show(MarksmanActivity.this, "Interstitial_Android");
							}*/
						} });
					        } catch (FileNotFoundException e) {
					        runOnUiThread(new Runnable() { 
						public void run() { 
							TastyToast.makeText(getApplicationContext(), "Error!", TastyToast.LENGTH_LONG, TastyToast.ERROR);
						} });
					    }             
			}
			else {
				runOnUiThread(new Runnable() { 
					public void run() { 
						TastyToast.makeText(getApplicationContext(), "Invalid!", TastyToast.LENGTH_LONG, TastyToast.ERROR);
					} });
			}
		}
	}
	
	
	public void _perm_huawei(final View _view) {
		i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
		i.setAction(Intent.ACTION_OPEN_DOCUMENT_TREE);
		muri = Uri.parse(CyberFilterPro());
		    i.putExtra(DocumentsContract.EXTRA_INITIAL_URI, muri);
		        startActivityForResult(i, NEW_FOLDER_REQUEST_CODE);
	}
	
	
	public void _th() {
	}public String CyberFilterPro(){
		
		final String deviceMan = android.os.Build.MANUFACTURER;
		final String output = deviceMan.toUpperCase();
		
		String CyberPro = "";
		String CyberFilterPro = "";
		
		
			if (output.equals("HUAWEI") || output.equals("HONOR")) {
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
				CyberPro = "content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3AAndroid%2Fdata%2Fcom.mobilelegends.hwag%2Ffiles%2Fdragon2017%2Fassets";
			}else{
				CyberPro = "content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3AAndroid%2Fdata%2Fcom.mobile.legends%2Ffiles%2Fdragon2017%2Fassets";
				
				CyberFilterPro = CyberPro;
			}
			return CyberFilterPro;
			}
			else {	
			
			CyberPro = "content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3AAndroid%2Fdata%2Fcom.mobile.legends%2Ffiles%2Fdragon2017%2Fassets";
			
			CyberFilterPro = CyberPro;
			
				return CyberFilterPro;
				}
			
	}
	
	
	public void _Auto11() {
	}
	private class CyberTask11 extends AsyncTask<String, Integer, String> {
		KProgressHUD hud;
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			hud = new KProgressHUD(MarksmanActivity.this).setStyle(KProgressHUD.Style.BAR_DETERMINATE).setLabel("RENIER LOVE TOMBOY")
			.setMaxProgress(100);
			SketchwareUtil.showMessage(getApplicationContext(), "Make sure on your data or wifi");
			hud.show();
			
		}
		String filename = "";
		String result = "";
		double size = 0;
		double sumCount = 0;
		
		@Override
		protected String doInBackground(String... address) {
			try {
				filename= URLUtil.guessFileName(address[0], null, null);
				
				urit = Uri.parse(sp.getString("D_URI", "")); 
				path = DocumentFile.fromTreeUri(MarksmanActivity.this, urit);
				path1 = path.createFile("*/*", filename.toLowerCase());
				int resCode = -1;
				java.io.InputStream in = null;
				java.net.URL url = new java.net.URL(address[0]);
				java.net.URLConnection urlConn = url.openConnection();
				if (!(urlConn instanceof java.net.HttpURLConnection)) {
					throw new java.io.IOException("URL is not an Http URL"); }
				java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) urlConn; httpConn.setAllowUserInteraction(false); httpConn.setInstanceFollowRedirects(true); httpConn.setRequestMethod("GET"); httpConn.connect();
				resCode = httpConn.getResponseCode();
				if (resCode == java.net.HttpURLConnection.HTTP_OK) {
					in = httpConn.getInputStream();
					size = httpConn.getContentLength();
					
				} else { result = "There was an error"; }
				 
				
				OutputStream output = getContentResolver().openOutputStream(path1.getUri());
				
				try {
					int bytesRead;
					sumCount = 0;
					byte[] buffer = new byte[1024];
					while ((bytesRead = in.read(buffer)) != -1) {
						output.write(buffer, 0, bytesRead);
						sumCount += bytesRead;
						if (size > 0) {
							publishProgress((int)Math.round(sumCount*100 / size));
						}
					}
				} finally {
					output.close();
				}
				result ="";
				in.close();
			} catch (java.net.MalformedURLException e) {
				result = e.getMessage();
			} catch (java.io.IOException e) {
				result = e.getMessage();
			} catch (Exception e) {
				result = e.toString();
			}
			return result;
			
		}
		@Override
		protected void onProgressUpdate(Integer... values) {
			super.onProgressUpdate(values);
			hud.setProgress(values[values.length - 1]);
			hud.setDetailsLabel(String.valueOf((long)(values[values.length - 1])).concat("% Injecting"));
		}
		protected void onPostExecute(String s){
			suri = Uri.parse(sp.getString("D_URI", "")); 
			urit = Uri.parse(sp.getString("D_URI", "").concat(filename.toLowerCase())); 
			path = DocumentFile.fromTreeUri(MarksmanActivity.this, suri);
			filepath = DocumentFile.fromTreeUri(MarksmanActivity.this, urit);
			files = filename;
			Decompress d = new Decompress(filepath, path, MarksmanActivity.this); 
			d.execute();
		}
	}
	
	
	public void _set(final String _image, final String _name, final String _script) {
		final AlertDialog dialog2 = new AlertDialog.Builder(MarksmanActivity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.dialog, null);
		dialog2.setView(inflate);
		dialog2.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		final Button btn1 = (Button) inflate.findViewById(R.id.button1);
		final Button btn2 = (Button)
		inflate.findViewById(R.id.button2); 
		final LinearLayout lin1 = (LinearLayout) inflate.findViewById(R.id.linear);
		final LinearLayout lin2 = (LinearLayout) inflate.findViewById(R.id.linear1);
		final TextView t1 = (TextView) inflate.findViewById(R.id.name);
		final TextView t2 = (TextView) inflate.findViewById(R.id.msg);
		final ImageView img1 = (ImageView) inflate.findViewById(R.id.imageview1);
		 
		dialog2.show();
		
		t1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		t2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		btn1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		btn2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/zeroes_one.ttf"), 0);
		btn1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)10, 0xFF00BCD4));
		btn2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)10, 0xFF607D8B));
		lin1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFFFFFFFF));
		lin2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)18, 0xFF212121));
		com.bumptech.glide.request.RequestOptions oimg1 = new com.bumptech.glide.request.RequestOptions(); oimg1.circleCrop(); 
		
		Glide.with(getApplicationContext())
		.load(_image)
		.apply(oimg1)
		.placeholder(R.drawable.logo)
		.into(img1);
		t1.setText(_name);
		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
					new CyberTask11().execute(_script.replace("blob", "raw"));
				}else{
					new HUDTask().execute(_script.replace("blob", "raw"));
				}
				dialog2.dismiss();
			}
		});
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dialog2.dismiss();
			}
		});
	}
	
	
	public void _ClickAnimation(final boolean _clickanim, final double _animDuration, final View _view) {
		_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
						switch (event.getAction()){
								case MotionEvent.ACTION_DOWN:{
										
										_view.setScaleX((float)(0.9d));
										_view.setScaleY((float)(0.9d));
										t = new TimerTask() {
												@Override
												public void run() {
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		_view.setScaleX((float)(1));
																		_view.setScaleY((float)(1));
																}
														});
												}
										};
										_timer.schedule(t, (int)(100));
										break;
								}
								case MotionEvent.ACTION_UP:{
										_view.setScaleX((float)(0.9d));
										_view.setScaleY((float)(0.9d));
										t = new TimerTask() {
												@Override
												public void run() {
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		_view.setScaleX((float)(1));
																		_view.setScaleY((float)(1));
																}
														});
												}
										};
										_timer.schedule(t, (int)(100));
										break;
								}
						}
						return false;
				}
		});
	}
	
	
	public void _FadForyou(final View _view, final double _Durationofscale, final double _TotalDuration) {
		_Animator(_view, "scaleX", 0, 0);
		_Animator(_view, "scaleY", 0, 0);
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(_view, "scaleX", 1, _Durationofscale);
						_Animator(_view, "scaleY", 1, _Durationofscale);
					}
				});
			}
		};
		_timer.schedule(t, (int)(_TotalDuration));
		_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
						switch (event.getAction()){
								case MotionEvent.ACTION_DOWN:{
										
										_view.setScaleX((float)(0.9d));
										_view.setScaleY((float)(0.9d));
										t = new TimerTask() {
												@Override
												public void run() {
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		_view.setScaleX((float)(1));
																		_view.setScaleY((float)(1));
																}
														});
												}
										};
										_timer.schedule(t, (int)(100));
										break;
								}
								case MotionEvent.ACTION_UP:{
										_view.setScaleX((float)(0.9d));
										_view.setScaleY((float)(0.9d));
										t = new TimerTask() {
												@Override
												public void run() {
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		_view.setScaleX((float)(1));
																		_view.setScaleY((float)(1));
																}
														});
												}
										};
										_timer.schedule(t, (int)(100));
										break;
								}
						}
						return false;
				}
		});
	}
	
	
	public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	public void _card_style(final View _view, final double _shadow, final double _rounds, final String _colour) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_colour));
		gd.setCornerRadius((int)_rounds);
		_view.setBackground(gd);
		_view.setElevation((int)_shadow);
	}
	
	
	public void _click_Target(final View _view, final String _title, final String _msg, final String _colour) {
		// onStart()
		
		TapTargetView.showFor(MarksmanActivity.this,
		
		TapTarget.forView(_view, _title, _msg)
		
		//Background Color Tab Target
		.outerCircleColorInt(Color.parseColor(_colour))
		
		.outerCircleAlpha(0.99f)
		.targetCircleColor(android.R.color.white)
		.titleTextSize(24)
		.titleTextColor(android.R.color.white)
		.descriptionTextSize(18)
		.descriptionTextColor(android.R.color.white)
		.textColor(android.R.color.white)
		.textTypeface(Typeface.SANS_SERIF)
		.dimColor(android.R.color.black)
		.drawShadow(true)
		.cancelable(false)
		.tintTarget(true)
		.transparentTarget(true)
		.targetRadius(40),
		new TapTargetView.Listener() {
			@Override public void onTargetClick(TapTargetView view) {
				super.onTargetClick(view);
			}});
		
		// onPostCreate()
		
	}static class UiUtil {
		    UiUtil() {
			    }
		    static int dp(Context context, int val) {
			        return (int) TypedValue.applyDimension(
			                TypedValue.COMPLEX_UNIT_DIP, val, context.getResources().getDisplayMetrics());
			    }
		    static int sp(Context context, int val) {
			        return (int) TypedValue.applyDimension(
			                TypedValue.COMPLEX_UNIT_SP, val, context.getResources().getDisplayMetrics());
			    }
		    static int themeIntAttr(Context context, String attr) {
			        final android.content.res.Resources.Theme theme = context.getTheme();
			        if (theme == null) {
				            return -1;
				        }
			        final TypedValue value = new TypedValue();
			        final int id = context.getResources().getIdentifier(attr, "attr", context.getPackageName());
			
			        if (id == 0) {
				            // Not found
				            return -1;
				        }
			        theme.resolveAttribute(id, value, true);
			        return value.data;
			    }
		    static int setAlpha(int argb, float alpha) {
			        if (alpha > 1.0f) {
				            alpha = 1.0f;
				        } else if (alpha <= 0.0f) {
				            alpha = 0.0f;
				        }
			        return ((int) ((argb >>> 24) * alpha) << 24) | (argb & 0x00FFFFFF);
			    }
	}
			static class FloatValueAnimatorBuilder {
		
		    private final ValueAnimator animator;
		
		    private EndListener endListener;
		
		    interface UpdateListener {
			        void onUpdate(float lerpTime);
			    }
		    interface EndListener {
			        void onEnd();
			    }
		    protected FloatValueAnimatorBuilder() {
			        this(false);
			    }
		    FloatValueAnimatorBuilder(boolean reverse) {
			        if (reverse) {
				            this.animator = ValueAnimator.ofFloat(1.0f, 0.0f);
				        } else {
				            this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
				        }
			    }
		    public FloatValueAnimatorBuilder delayBy(long millis) {
			        animator.setStartDelay(millis);
			        return this;
			    }
		    public FloatValueAnimatorBuilder duration(long millis) {
			        animator.setDuration(millis);
			        return this;
			    }
		    public FloatValueAnimatorBuilder interpolator(TimeInterpolator lerper) {
			        animator.setInterpolator(lerper);
			        return this;
			    }
		    public FloatValueAnimatorBuilder repeat(int times) {
			        animator.setRepeatCount(times);
			        return this;
			    }
		    public FloatValueAnimatorBuilder onUpdate(final UpdateListener listener) {
			        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				            @Override
				            public void onAnimationUpdate(ValueAnimator animation) {
					                listener.onUpdate((float) animation.getAnimatedValue());
					            }
				        });
			        return this;
			    }
		    public FloatValueAnimatorBuilder onEnd(final EndListener listener) {
			        this.endListener = listener;
			        return this;
			    }
		    public ValueAnimator build() {
			        if (endListener != null) {
				            animator.addListener(new AnimatorListenerAdapter() {
					                @Override
					                public void onAnimationEnd(Animator animation) {
						                    endListener.onEnd();
						                }
					            });
				        }
			        return animator;
			    }
	}
			static class ReflectUtil {
		    ReflectUtil() {
			    }
		    static Object getPrivateField(Object source, String fieldName)
		            throws NoSuchFieldException, IllegalAccessException {
			        final java.lang.reflect.Field objectField = source.getClass().getDeclaredField(fieldName);
			        objectField.setAccessible(true);
			        return objectField.get(source);
			    }
	}
			static class TapTarget extends Activity {
		    final CharSequence title;
		    final CharSequence description;
		    float outerCircleAlpha = 0.96f;
		    int targetRadius = 44;
		    Rect bounds;
		    android.graphics.drawable.Drawable icon;
		    Typeface titleTypeface;
		    Typeface descriptionTypeface;
		
		
		    private int outerCircleColorRes = -1;
		    private int targetCircleColorRes = -1;
		    private int dimColorRes = -1;
		    private int titleTextColorRes = -1;
		    private int descriptionTextColorRes = -1;
		
		    private Integer outerCircleColor = null;
		    private Integer targetCircleColor = null;
		    private Integer dimColor = null;
		    private Integer titleTextColor = null;
		    private Integer descriptionTextColor = null;
		
		    private int titleTextDimen = -1;
		    private int descriptionTextDimen = -1;
		    private int titleTextSize = 20;
		    private int descriptionTextSize = 18;
		    int id = -1;
		    boolean drawShadow = false;
		    boolean cancelable = true;
		    boolean tintTarget = true;
		    boolean transparentTarget = false;
		    float descriptionTextAlpha = 0.54f;
		
		    public static TapTarget forView(View view, CharSequence title) {
			        return forView(view, title, null);
			    }
		    public static TapTarget forView(View view, CharSequence title, CharSequence description) {
			        return new ViewTapTarget(view, title, description);
			    }
		    public static TapTarget forBounds(Rect bounds, CharSequence title) {
			        return forBounds(bounds, title, null);
			    }
		    public static TapTarget forBounds(Rect bounds, CharSequence title,  CharSequence description) {
			        return new TapTarget(bounds, title, description);
			    }
		    protected TapTarget(Rect bounds, CharSequence title,  CharSequence description) {
			        this(title, description);
			        if (bounds == null) {
				            throw new IllegalArgumentException("Cannot pass null bounds or title");
				        }
			        this.bounds = bounds;
			    }
		    protected TapTarget(CharSequence title,  CharSequence description) {
			        if (title == null) {
				            throw new IllegalArgumentException("Cannot pass null title");
				        }
			        this.title = title;
			        this.description = description;
			    }
		    public TapTarget transparentTarget(boolean transparent) {
			        this.transparentTarget = transparent;
			        return this;
			    }
		    public TapTarget outerCircleColor( int color) {
			        this.outerCircleColorRes = color;
			        return this;
			    }
		    public TapTarget outerCircleColorInt( int color) {
			        this.outerCircleColor = color;
			        return this;
			    }
		    public TapTarget outerCircleAlpha(float alpha) {
			        if (alpha < 0.0f || alpha > 1.0f) {
				            throw new IllegalArgumentException("Given an invalid alpha value: " + alpha);
				        }
			        this.outerCircleAlpha = alpha;
			        return this;
			    }
		    public TapTarget targetCircleColor( int color) {
			        this.targetCircleColorRes = color;
			        return this;
			    }
		    public TapTarget targetCircleColorInt( int color) {
			        this.targetCircleColor = color;
			        return this;
			    }
		    public TapTarget textColor( int color) {
			        this.titleTextColorRes = color;
			        this.descriptionTextColorRes = color;
			        return this;
			    }
		    public TapTarget textColorInt( int color) {
			        this.titleTextColor = color;
			        this.descriptionTextColor = color;
			        return this;
			    }
		    public TapTarget titleTextColor( int color) {
			        this.titleTextColorRes = color;
			        return this;
			    }
		    public TapTarget titleTextColorInt( int color) {
			        this.titleTextColor = color;
			        return this;
			    }
		    public TapTarget descriptionTextColor( int color) {
			        this.descriptionTextColorRes = color;
			        return this;
			    }
		    public TapTarget descriptionTextColorInt( int color) {
			        this.descriptionTextColor = color;
			        return this;
			    }
		    public TapTarget textTypeface(Typeface typeface) {
			        if (typeface == null) throw new IllegalArgumentException("Cannot use a null typeface");
			        titleTypeface = typeface;
			        descriptionTypeface = typeface;
			        return this;
			    }
		    public TapTarget titleTypeface(Typeface titleTypeface) {
			        if (titleTypeface == null) throw new IllegalArgumentException("Cannot use a null typeface");
			        this.titleTypeface = titleTypeface;
			        return this;
			    }
		    public TapTarget descriptionTypeface(Typeface descriptionTypeface) {
			        if (descriptionTypeface == null) throw new IllegalArgumentException("Cannot use a null typeface");
			        this.descriptionTypeface = descriptionTypeface;
			        return this;
			    }
		    public TapTarget titleTextSize(int sp) {
			        if (sp < 0) throw new IllegalArgumentException("Given negative text size");
			        this.titleTextSize = sp;
			        return this;
			    }
		    public TapTarget descriptionTextSize(int sp) {
			        if (sp < 0) throw new IllegalArgumentException("Given negative text size");
			        this.descriptionTextSize = sp;
			        return this;
			    }
		    public TapTarget titleTextDimen( int dimen) {
			        this.titleTextDimen = dimen;
			        return this;
			    }
		    public TapTarget descriptionTextAlpha(float descriptionTextAlpha) {
			        if (descriptionTextAlpha < 0 || descriptionTextAlpha > 1f) {
				            throw new IllegalArgumentException("Given an invalid alpha value: " + descriptionTextAlpha);
				        }
			        this.descriptionTextAlpha = descriptionTextAlpha;
			        return this;
			    }
		    public TapTarget descriptionTextDimen( int dimen) {
			        this.descriptionTextDimen = dimen;
			        return this;
			    }
		    public TapTarget dimColor( int color) {
			        this.dimColorRes = color;
			        return this;
			    }
		    public TapTarget dimColorInt( int color) {
			        this.dimColor = color;
			        return this;
			    }
		    public TapTarget drawShadow(boolean draw) {
			        this.drawShadow = draw;
			        return this;
			    }
		    public TapTarget cancelable(boolean status) {
			        this.cancelable = status;
			        return this;
			    }
		    public TapTarget tintTarget(boolean tint) {
			        this.tintTarget = tint;
			        return this;
			    }
		    public TapTarget icon(android.graphics.drawable.Drawable icon) {
			        return icon(icon, false);
			    }
		    public TapTarget icon(android.graphics.drawable.Drawable icon, boolean hasSetBounds) {
			        if (icon == null) throw new IllegalArgumentException("Cannot use null drawable");
			        this.icon = icon;
			        if (!hasSetBounds) {
				            this.icon.setBounds(new Rect(0, 0, this.icon.getIntrinsicWidth(), this.icon.getIntrinsicHeight()));
				        }
			        return this;
			    }
		    public TapTarget id(int id) {
			        this.id = id;
			        return this;
			    }
		    public TapTarget targetRadius(int targetRadius) {
			        this.targetRadius = targetRadius;
			        return this;
			    }
		    public int id() {
			        return id;
			    }
		    public void onReady(Runnable runnable) {
			        runnable.run();
			    }
		    public Rect bounds() {
			        if (bounds == null) {
				            throw new IllegalStateException("Requesting bounds that are not set! Make sure your target is ready");
				        }
			        return bounds;
			    }
		    Integer outerCircleColorInt(Context context) {
			        return colorResOrInt(context, outerCircleColor, outerCircleColorRes);
			    }
		    Integer targetCircleColorInt(Context context) {
			        return colorResOrInt(context, targetCircleColor, targetCircleColorRes);
			    }
		    Integer dimColorInt(Context context) {
			        return colorResOrInt(context, dimColor, dimColorRes);
			    }
		    Integer titleTextColorInt(Context context) {
			        return colorResOrInt(context, titleTextColor, titleTextColorRes);
			    }
		
		    Integer descriptionTextColorInt(Context context) {
			        return colorResOrInt(context, descriptionTextColor, descriptionTextColorRes);
			    }
		    int titleTextSizePx(Context context) {
			        return dimenOrSize(context, titleTextSize, titleTextDimen);
			    }
		    int descriptionTextSizePx(Context context) {
			        return dimenOrSize(context, descriptionTextSize, descriptionTextDimen);
			    }
		
		    private Integer colorResOrInt(Context context, Integer value,  int resource) {
			        if (resource != -1) {
				            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
					                return context.getColor(resource);
					            }
				        }
			        return value;
			    }
		    private int dimenOrSize(Context context, int size,  int dimen) {
			        if (dimen != -1) {
				            return context.getResources().getDimensionPixelSize(dimen);
				        }
			        return UiUtil.sp(context, size);
			    }
	}
			static class TapTargetView extends View {
		    private boolean isDismissed = false;
		    private boolean isDismissing = false;
		    private boolean isInteractable = true;
		
		    final int TARGET_PADDING;
		    final int TARGET_RADIUS;
		    final int TARGET_PULSE_RADIUS;
		    final int TEXT_PADDING;
		    final int TEXT_SPACING;
		    final int TEXT_MAX_WIDTH;
		    final int TEXT_POSITIONING_BIAS;
		    final int CIRCLE_PADDING;
		    final int GUTTER_DIM;
		    final int SHADOW_DIM;
		    final int SHADOW_JITTER_DIM;
		
		
		    final ViewGroup boundingParent;
		    final ViewManager parent;
		    final TapTarget target;
		    final Rect targetBounds;
		
		    final TextPaint titlePaint;
		    final TextPaint descriptionPaint;
		    final Paint outerCirclePaint;
		    final Paint outerCircleShadowPaint;
		    final Paint targetCirclePaint;
		    final Paint targetCirclePulsePaint;
		
		    CharSequence title;
		
		    StaticLayout titleLayout;
		
		    CharSequence description;
		
		    StaticLayout descriptionLayout;
		    boolean isDark;
		    boolean debug;
		    boolean shouldTintTarget;
		    boolean shouldDrawShadow;
		    boolean cancelable;
		    boolean visible;
		
		    // Debug related variables
		
		    SpannableStringBuilder debugStringBuilder;
		
		    DynamicLayout debugLayout;
		
		    TextPaint debugTextPaint;
		
		    Paint debugPaint;
		
		    // Drawing properties
		    Rect drawingBounds;
		    Rect textBounds;
		
		    Path outerCirclePath;
		    float outerCircleRadius;
		    int calculatedOuterCircleRadius;
		    int[] outerCircleCenter;
		    int outerCircleAlpha;
		
		    float targetCirclePulseRadius;
		    int targetCirclePulseAlpha;
		
		    float targetCircleRadius;
		    int targetCircleAlpha;
		
		    int textAlpha;
		    int dimColor;
		
		    float lastTouchX;
		    float lastTouchY;
		
		    int topBoundary;
		    int bottomBoundary;
		
		    Bitmap tintedTarget;
		
		    Listener listener;
		
		
		    ViewOutlineProvider outlineProvider;
		
		    public static TapTargetView showFor(Activity activity, TapTarget target) {
			        return showFor(activity, target, null);
			    }
		
		    public static TapTargetView showFor(Activity activity, TapTarget target, Listener listener) {
			        if (activity == null) throw new IllegalArgumentException("Activity is null");
			
			        final ViewGroup decor = (ViewGroup) activity.getWindow().getDecorView();
			        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
			                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
			        final ViewGroup content = (ViewGroup) decor.findViewById(android.R.id.content);
			        final TapTargetView tapTargetView = new TapTargetView(activity, decor, content, target, listener);
			        decor.addView(tapTargetView, layoutParams);
			
			        return tapTargetView;
			    }
		
		    public static TapTargetView showFor(Dialog dialog, TapTarget target) {
			        return showFor(dialog, target, null);
			    }
		
		    public static TapTargetView showFor(Dialog dialog, TapTarget target, Listener listener) {
			        if (dialog == null) throw new IllegalArgumentException("Dialog is null");
			
			        final Context context = dialog.getContext();
			        final WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
			        final WindowManager.LayoutParams params = new WindowManager.LayoutParams();
			        params.type = WindowManager.LayoutParams.TYPE_APPLICATION;
			        params.format = PixelFormat.RGBA_8888;
			        params.flags = 0;
			        params.gravity = Gravity.START | Gravity.TOP;
			        params.x = 0;
			        params.y = 0;
			        params.width = WindowManager.LayoutParams.MATCH_PARENT;
			        params.height = WindowManager.LayoutParams.MATCH_PARENT;
			
			        final TapTargetView tapTargetView = new TapTargetView(context, windowManager, null, target, listener);
			        windowManager.addView(tapTargetView, params);
			
			        return tapTargetView;
			    }
		
		    public static class Listener {
			        /** Signals that the user has clicked inside of the target **/
			        public void onTargetClick(TapTargetView view) {
				            view.dismiss(true);
				        }
			
			        /** Signals that the user has long clicked inside of the target **/
			        public void onTargetLongClick(TapTargetView view) {
				            onTargetClick(view);
				        }
			
			        /** If cancelable, signals that the user has clicked outside of the outer circle **/
			        public void onTargetCancel(TapTargetView view) {
				            view.dismiss(false);
				        }
			
			        /** Signals that the user clicked on the outer circle portion of the tap target **/
			        public void onOuterCircleClick(TapTargetView view) {
				            // no-op as default
				        }
			
			        /**
         * Signals that the tap target has been dismissed
         * @param userInitiated Whether the user caused this action
         *
         *
         */
			        public void onTargetDismissed(TapTargetView view, boolean userInitiated) {
				        }
			    }
		
		    final FloatValueAnimatorBuilder.UpdateListener expandContractUpdateListener = new FloatValueAnimatorBuilder.UpdateListener() {
			        @Override
			        public void onUpdate(float lerpTime) {
				            final float newOuterCircleRadius = calculatedOuterCircleRadius * lerpTime;
				            final boolean expanding = newOuterCircleRadius > outerCircleRadius;
				            if (!expanding) {
					                // When contracting we need to invalidate the old drawing bounds. Otherwise
					                // you will see artifacts as the circle gets smaller
					                calculateDrawingBounds();
					            }
				
				            final float targetAlpha = target.outerCircleAlpha * 255;
				            outerCircleRadius = newOuterCircleRadius;
				            outerCircleAlpha = (int) Math.min(targetAlpha, (lerpTime * 1.5f * targetAlpha));
				            outerCirclePath.reset();
				            outerCirclePath.addCircle(outerCircleCenter[0], outerCircleCenter[1], outerCircleRadius, Path.Direction.CW);
				
				            targetCircleAlpha = (int) Math.min(255.0f, (lerpTime * 1.5f * 255.0f));
				
				            if (expanding) {
					                targetCircleRadius = TARGET_RADIUS * Math.min(1.0f, lerpTime * 1.5f);
					            } else {
					                targetCircleRadius = TARGET_RADIUS * lerpTime;
					                targetCirclePulseRadius *= lerpTime;
					            }
				
				            textAlpha = (int) (delayedLerp(lerpTime, 0.7f) * 255);
				
				            if (expanding) {
					                calculateDrawingBounds();
					            }
				
				            invalidateViewAndOutline(drawingBounds);
				        }
			    };
		
		    final ValueAnimator expandAnimation = new FloatValueAnimatorBuilder()
		            .duration(250)
		            .delayBy(250)
		            .interpolator(new AccelerateDecelerateInterpolator())
		            .onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			                @Override
			                public void onUpdate(float lerpTime) {
				                    expandContractUpdateListener.onUpdate(lerpTime);
				                }
			            })
		            .onEnd(new FloatValueAnimatorBuilder.EndListener() {
			                @Override
			                public void onEnd() {
				                    pulseAnimation.start();
				                    isInteractable = true;
				                }
			            })
		            .build();
		
		    final ValueAnimator pulseAnimation = new FloatValueAnimatorBuilder()
		            .duration(1000)
		            .repeat(ValueAnimator.INFINITE)
		            .interpolator(new AccelerateDecelerateInterpolator())
		            .onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			                @Override
			                public void onUpdate(float lerpTime) {
				                    final float pulseLerp = delayedLerp(lerpTime, 0.5f);
				                    targetCirclePulseRadius = (1.0f + pulseLerp) * TARGET_RADIUS;
				                    targetCirclePulseAlpha = (int) ((1.0f - pulseLerp) * 255);
				                    targetCircleRadius = TARGET_RADIUS + halfwayLerp(lerpTime) * TARGET_PULSE_RADIUS;
				
				                    if (outerCircleRadius != calculatedOuterCircleRadius) {
					                        outerCircleRadius = calculatedOuterCircleRadius;
					                    }
				
				                    calculateDrawingBounds();
				                    invalidateViewAndOutline(drawingBounds);
				                }
			            })
		            .build();
		
		    final ValueAnimator dismissAnimation = new FloatValueAnimatorBuilder(true)
		            .duration(250)
		            .interpolator(new AccelerateDecelerateInterpolator())
		            .onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			                @Override
			                public void onUpdate(float lerpTime) {
				                    expandContractUpdateListener.onUpdate(lerpTime);
				                }
			            })
		            .onEnd(new FloatValueAnimatorBuilder.EndListener() {
			                @Override
			                public void onEnd() {
				                    onDismiss(true);
				                    ViewUtil.removeView(parent, TapTargetView.this);
				                }
			            })
		            .build();
		
		    private final ValueAnimator dismissConfirmAnimation = new FloatValueAnimatorBuilder()
		            .duration(250)
		            .interpolator(new AccelerateDecelerateInterpolator())
		            .onUpdate(new FloatValueAnimatorBuilder.UpdateListener() {
			                @Override
			                public void onUpdate(float lerpTime) {
				                    final float spedUpLerp = Math.min(1.0f, lerpTime * 2.0f);
				                    outerCircleRadius = calculatedOuterCircleRadius * (1.0f + (spedUpLerp * 0.2f));
				                    outerCircleAlpha = (int) ((1.0f - spedUpLerp) * target.outerCircleAlpha * 255.0f);
				                    outerCirclePath.reset();
				                    outerCirclePath.addCircle(outerCircleCenter[0], outerCircleCenter[1], outerCircleRadius, Path.Direction.CW);
				                    targetCircleRadius = (1.0f - lerpTime) * TARGET_RADIUS;
				                    targetCircleAlpha = (int) ((1.0f - lerpTime) * 255.0f);
				                    targetCirclePulseRadius = (1.0f + lerpTime) * TARGET_RADIUS;
				                    targetCirclePulseAlpha = (int) ((1.0f - lerpTime) * targetCirclePulseAlpha);
				                    textAlpha = (int) ((1.0f - spedUpLerp) * 255.0f);
				                    calculateDrawingBounds();
				                    invalidateViewAndOutline(drawingBounds);
				                }
			            })
		            .onEnd(new FloatValueAnimatorBuilder.EndListener() {
			                @Override
			                public void onEnd() {
				                    onDismiss(true);
				                    ViewUtil.removeView(parent, TapTargetView.this);
				                }
			            })
		            .build();
		
		    private ValueAnimator[] animators = new ValueAnimator[]
		            {expandAnimation, pulseAnimation, dismissConfirmAnimation, dismissAnimation};
		
		    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
		    public TapTargetView(final Context context,
		                         final ViewManager parent,
		                          final ViewGroup boundingParent,
		                         final TapTarget target,
		                          final Listener userListener) {
			        super(context);
			        if (target == null) throw new IllegalArgumentException("Target cannot be null");
			
			        this.target = target;
			        this.parent = parent;
			        this.boundingParent = boundingParent;
			        this.listener = userListener != null ? userListener : new Listener();
			        this.title = target.title;
			        this.description = target.description;
			
			        TARGET_PADDING = UiUtil.dp(context, 20);
			        CIRCLE_PADDING = UiUtil.dp(context, 40);
			        TARGET_RADIUS = UiUtil.dp(context, target.targetRadius);
			        TEXT_PADDING = UiUtil.dp(context, 40);
			        TEXT_SPACING = UiUtil.dp(context, 8);
			        TEXT_MAX_WIDTH = UiUtil.dp(context, 360);
			        TEXT_POSITIONING_BIAS = UiUtil.dp(context, 20);
			        GUTTER_DIM = UiUtil.dp(context, 88);
			        SHADOW_DIM = UiUtil.dp(context, 8);
			        SHADOW_JITTER_DIM = UiUtil.dp(context, 1);
			        TARGET_PULSE_RADIUS = (int) (0.1f * TARGET_RADIUS);
			
			        outerCirclePath = new Path();
			        targetBounds = new Rect();
			        drawingBounds = new Rect();
			
			        titlePaint = new TextPaint();
			        titlePaint.setTextSize(target.titleTextSizePx(context));
			        titlePaint.setTypeface(Typeface.create("sans-serif-medium", Typeface.NORMAL));
			        titlePaint.setAntiAlias(true);
			
			        descriptionPaint = new TextPaint();
			        descriptionPaint.setTextSize(target.descriptionTextSizePx(context));
			        descriptionPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL));
			        descriptionPaint.setAntiAlias(true);
			        descriptionPaint.setAlpha((int) (0.54f * 255.0f));
			
			        outerCirclePaint = new Paint();
			        outerCirclePaint.setAntiAlias(true);
			        outerCirclePaint.setAlpha((int) (target.outerCircleAlpha * 255.0f));
			
			        outerCircleShadowPaint = new Paint();
			        outerCircleShadowPaint.setAntiAlias(true);
			        outerCircleShadowPaint.setAlpha(50);
			        outerCircleShadowPaint.setStyle(Paint.Style.STROKE);
			        outerCircleShadowPaint.setStrokeWidth(SHADOW_JITTER_DIM);
			        outerCircleShadowPaint.setColor(Color.BLACK);
			
			        targetCirclePaint = new Paint();
			        targetCirclePaint.setAntiAlias(true);
			
			        targetCirclePulsePaint = new Paint();
			        targetCirclePulsePaint.setAntiAlias(true);
			
			        applyTargetOptions(context);
			
			        globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
				            @Override
				            public void onGlobalLayout() {
					                if (isDismissing) {
						                    return;
						                }
					                updateTextLayouts();
					                target.onReady(new Runnable() {
						                    @Override
						                    public void run() {
							                        final int[] offset = new int[2];
							
							                        targetBounds.set(target.bounds());
							
							                        getLocationOnScreen(offset);
							                        targetBounds.offset(-offset[0], -offset[1]);
							
							                        if (boundingParent != null) {
								                            final WindowManager windowManager
								                                    = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
								                            final DisplayMetrics displayMetrics = new DisplayMetrics();
								                            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
								
								                            final Rect rect = new Rect();
								                            boundingParent.getWindowVisibleDisplayFrame(rect);
								
								                            // We bound the boundaries to be within the screen's coordinates to
								                            // handle the case where the layout bounds do not match
								                            // (like when FLAG_LAYOUT_NO_LIMITS is specified)
								                            topBoundary = Math.max(0, rect.top);
								                            bottomBoundary = Math.min(rect.bottom, displayMetrics.heightPixels);
								                        }
							
							                        drawTintedTarget();
							                        requestFocus();
							                        calculateDimensions();
							
							                        startExpandAnimation();
							                    }
						                });
					            }
				        };
			
			        getViewTreeObserver().addOnGlobalLayoutListener(globalLayoutListener);
			
			        setFocusableInTouchMode(true);
			        setClickable(true);
			        setOnClickListener(new OnClickListener() {
				            @Override
				            public void onClick(View v) {
					                if (listener == null || outerCircleCenter == null || !isInteractable) return;
					
					                final boolean clickedInTarget =
					                        distance(targetBounds.centerX(), targetBounds.centerY(), (int) lastTouchX, (int) lastTouchY) <= targetCircleRadius;
					                final double distanceToOuterCircleCenter = distance(outerCircleCenter[0], outerCircleCenter[1],
					                        (int) lastTouchX, (int) lastTouchY);
					                final boolean clickedInsideOfOuterCircle = distanceToOuterCircleCenter <= outerCircleRadius;
					
					                if (clickedInTarget) {
						                    isInteractable = false;
						                    listener.onTargetClick(TapTargetView.this);
						                } else if (clickedInsideOfOuterCircle) {
						                    listener.onOuterCircleClick(TapTargetView.this);
						                } else if (cancelable) {
						                    isInteractable = false;
						                    listener.onTargetCancel(TapTargetView.this);
						                }
					            }
				        });
			
			        setOnLongClickListener(new OnLongClickListener() {
				            @Override
				            public boolean onLongClick(View v) {
					                if (listener == null) return false;
					
					                if (targetBounds.contains((int) lastTouchX, (int) lastTouchY)) {
						                    listener.onTargetLongClick(TapTargetView.this);
						                    return true;
						                }
					
					                return false;
					            }
				        });
			    }
		
		    private void startExpandAnimation() {
			        if (!visible) {
				            isInteractable = false;
				            expandAnimation.start();
				            visible = true;
				        }
			    }
		
		    protected void applyTargetOptions(Context context) {
			        shouldTintTarget = target.tintTarget;
			        shouldDrawShadow = target.drawShadow;
			        cancelable = target.cancelable;
			
			        // We can't clip out portions of a view outline, so if the user specified a transparent
			        // target, we need to fallback to drawing a jittered shadow approximation
			        if (shouldDrawShadow && Build.VERSION.SDK_INT >= 21 && !target.transparentTarget) {
				            outlineProvider = new ViewOutlineProvider() {
					                @Override
					                public void getOutline(View view, Outline outline) {
						                    if (outerCircleCenter == null) return;
						                    outline.setOval(
						                            (int) (outerCircleCenter[0] - outerCircleRadius), (int) (outerCircleCenter[1] - outerCircleRadius),
						                            (int) (outerCircleCenter[0] + outerCircleRadius), (int) (outerCircleCenter[1] + outerCircleRadius));
						                    outline.setAlpha(outerCircleAlpha / 255.0f);
						                    if (Build.VERSION.SDK_INT >= 22) {
							                        outline.offset(0, SHADOW_DIM);
							                    }
						                }
					            };
				
				            setOutlineProvider(outlineProvider);
				            setElevation(SHADOW_DIM);
				        }
			
			        if (shouldDrawShadow && outlineProvider == null && Build.VERSION.SDK_INT < 18) {
				            setLayerType(LAYER_TYPE_SOFTWARE, null);
				        } else {
				            setLayerType(LAYER_TYPE_HARDWARE, null);
				        }
			
			        final android.content.res.Resources.Theme theme = context.getTheme();
			        isDark = UiUtil.themeIntAttr(context, "isLightTheme") == 0;
			
			        final Integer outerCircleColor = target.outerCircleColorInt(context);
			        if (outerCircleColor != null) {
				            outerCirclePaint.setColor(outerCircleColor);
				        } else if (theme != null) {
				            outerCirclePaint.setColor(UiUtil.themeIntAttr(context, "colorPrimary"));
				        } else {
				            outerCirclePaint.setColor(Color.WHITE);
				        }
			
			        final Integer targetCircleColor = target.targetCircleColorInt(context);
			        if (targetCircleColor != null) {
				            targetCirclePaint.setColor(targetCircleColor);
				        } else {
				            targetCirclePaint.setColor(isDark ? Color.BLACK : Color.WHITE);
				        }
			
			        if (target.transparentTarget) {
				            targetCirclePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
				        }
			
			        targetCirclePulsePaint.setColor(targetCirclePaint.getColor());
			
			        final Integer targetDimColor = target.dimColorInt(context);
			        if (targetDimColor != null) {
				            dimColor = UiUtil.setAlpha(targetDimColor, 0.3f);
				        } else {
				            dimColor = -1;
				        }
			
			        final Integer titleTextColor = target.titleTextColorInt(context);
			        if (titleTextColor != null) {
				            titlePaint.setColor(titleTextColor);
				        } else {
				            titlePaint.setColor(isDark ? Color.BLACK : Color.WHITE);
				        }
			
			        final Integer descriptionTextColor = target.descriptionTextColorInt(context);
			        if (descriptionTextColor != null) {
				            descriptionPaint.setColor(descriptionTextColor);
				        } else {
				            descriptionPaint.setColor(titlePaint.getColor());
				        }
			
			        if (target.titleTypeface != null) {
				            titlePaint.setTypeface(target.titleTypeface);
				        }
			
			        if (target.descriptionTypeface != null) {
				            descriptionPaint.setTypeface(target.descriptionTypeface);
				        }
			    }
		
		    @Override
		    protected void onDetachedFromWindow() {
			        super.onDetachedFromWindow();
			        onDismiss(false);
			    }
		
		    void onDismiss(boolean userInitiated) {
			        if (isDismissed) return;
			
			        isDismissing = false;
			        isDismissed = true;
			
			        for (final ValueAnimator animator : animators) {
				            animator.cancel();
				            animator.removeAllUpdateListeners();
				        }
			        ViewUtil.removeOnGlobalLayoutListener(getViewTreeObserver(), globalLayoutListener);
			        visible = false;
			
			        if (listener != null) {
				            listener.onTargetDismissed(this, userInitiated);
				        }
			    }
		
		    @Override
		    protected void onDraw(Canvas c) {
			        if (isDismissed || outerCircleCenter == null) return;
			
			        if (topBoundary > 0 && bottomBoundary > 0) {
				            c.clipRect(0, topBoundary, getWidth(), bottomBoundary);
				        }
			
			        if (dimColor != -1) {
				            c.drawColor(dimColor);
				        }
			
			        int saveCount;
			        outerCirclePaint.setAlpha(outerCircleAlpha);
			        if (shouldDrawShadow && outlineProvider == null) {
				            saveCount = c.save();
				            {
					                c.clipPath(outerCirclePath, Region.Op.DIFFERENCE);
					                drawJitteredShadow(c);
					            }
				            c.restoreToCount(saveCount);
				        }
			        c.drawCircle(outerCircleCenter[0], outerCircleCenter[1], outerCircleRadius, outerCirclePaint);
			
			        targetCirclePaint.setAlpha(targetCircleAlpha);
			        if (targetCirclePulseAlpha > 0) {
				            targetCirclePulsePaint.setAlpha(targetCirclePulseAlpha);
				            c.drawCircle(targetBounds.centerX(), targetBounds.centerY(),
				                    targetCirclePulseRadius, targetCirclePulsePaint);
				        }
			        c.drawCircle(targetBounds.centerX(), targetBounds.centerY(),
			                targetCircleRadius, targetCirclePaint);
			
			        saveCount = c.save();
			        {
				            c.translate(textBounds.left, textBounds.top);
				            titlePaint.setAlpha(textAlpha);
				            if (titleLayout != null) {
					                titleLayout.draw(c);
					            }
				
				            if (descriptionLayout != null && titleLayout != null) {
					                c.translate(0, titleLayout.getHeight() + TEXT_SPACING);
					                descriptionPaint.setAlpha((int) (target.descriptionTextAlpha * textAlpha));
					                descriptionLayout.draw(c);
					            }
				        }
			        c.restoreToCount(saveCount);
			
			        saveCount = c.save();
			        {
				            if (tintedTarget != null) {
					                c.translate(targetBounds.centerX() - tintedTarget.getWidth() / 2,
					                        targetBounds.centerY() - tintedTarget.getHeight() / 2);
					                c.drawBitmap(tintedTarget, 0, 0, targetCirclePaint);
					            } else if (target.icon != null) {
					                c.translate(targetBounds.centerX() - target.icon.getBounds().width() / 2,
					                        targetBounds.centerY() - target.icon.getBounds().height() / 2);
					                target.icon.setAlpha(targetCirclePaint.getAlpha());
					                target.icon.draw(c);
					            }
				        }
			        c.restoreToCount(saveCount);
			
			        if (debug) {
				            drawDebugInformation(c);
				        }
			    }
		
		    @Override
		    public boolean onTouchEvent(MotionEvent e) {
			        lastTouchX = e.getX();
			        lastTouchY = e.getY();
			        return super.onTouchEvent(e);
			    }
		
		    @Override
		    public boolean onKeyDown(int keyCode, KeyEvent event) {
			        if (isVisible() && cancelable && keyCode == KeyEvent.KEYCODE_BACK) {
				            event.startTracking();
				            return true;
				        }
			
			        return false;
			    }
		
		    @Override
		    public boolean onKeyUp(int keyCode, KeyEvent event) {
			        if (isVisible() && isInteractable && cancelable
			                && keyCode == KeyEvent.KEYCODE_BACK && event.isTracking() && !event.isCanceled()) {
				            isInteractable = false;
				
				            if (listener != null) {
					                listener.onTargetCancel(this);
					            } else {
					                new Listener().onTargetCancel(this);
					            }
				
				            return true;
				        }
			
			        return false;
			    }
		
		    /**
     * Dismiss this view
     * @param tappedTarget If the user tapped the target or not
     *                     (results in different dismiss animations)
     */
		    public void dismiss(boolean tappedTarget) {
			        isDismissing = true;
			        pulseAnimation.cancel();
			        expandAnimation.cancel();
			        if (tappedTarget) {
				            dismissConfirmAnimation.start();
				        } else {
				            dismissAnimation.start();
				        }
			    }
		
		    /** Specify whether to draw a wireframe around the view, useful for debugging **/
		    public void setDrawDebug(boolean status) {
			        if (debug != status) {
				            debug = status;
				            postInvalidate();
				        }
			    }
		
		    /** Returns whether this view is visible or not **/
		    public boolean isVisible() {
			        return !isDismissed && visible;
			    }
		
		    void drawJitteredShadow(Canvas c) {
			        final float baseAlpha = 0.20f * outerCircleAlpha;
			        outerCircleShadowPaint.setStyle(Paint.Style.FILL_AND_STROKE);
			        outerCircleShadowPaint.setAlpha((int) baseAlpha);
			        c.drawCircle(outerCircleCenter[0], outerCircleCenter[1] + SHADOW_DIM, outerCircleRadius, outerCircleShadowPaint);
			        outerCircleShadowPaint.setStyle(Paint.Style.STROKE);
			        final int numJitters = 7;
			        for (int i = numJitters - 1; i > 0; --i) {
				            outerCircleShadowPaint.setAlpha((int) ((i / (float) numJitters) * baseAlpha));
				            c.drawCircle(outerCircleCenter[0], outerCircleCenter[1] + SHADOW_DIM ,
				                    outerCircleRadius + (numJitters - i) * SHADOW_JITTER_DIM , outerCircleShadowPaint);
				        }
			    }
		
		    void drawDebugInformation(Canvas c) {
			        if (debugPaint == null) {
				            debugPaint = new Paint();
				            debugPaint.setARGB(255, 255, 0, 0);
				            debugPaint.setStyle(Paint.Style.STROKE);
				            debugPaint.setStrokeWidth(UiUtil.dp(getContext(), 1));
				        }
			
			        if (debugTextPaint == null) {
				            debugTextPaint = new TextPaint();
				            debugTextPaint.setColor(0xFFFF0000);
				            debugTextPaint.setTextSize(UiUtil.sp(getContext(), 16));
				        }
			
			        // Draw wireframe
			        debugPaint.setStyle(Paint.Style.STROKE);
			        c.drawRect(textBounds, debugPaint);
			        c.drawRect(targetBounds, debugPaint);
			        c.drawCircle(outerCircleCenter[0], outerCircleCenter[1], 10, debugPaint);
			        c.drawCircle(outerCircleCenter[0], outerCircleCenter[1], calculatedOuterCircleRadius - CIRCLE_PADDING, debugPaint);
			        c.drawCircle(targetBounds.centerX(), targetBounds.centerY(), TARGET_RADIUS + TARGET_PADDING, debugPaint);
			
			        // Draw positions and dimensions
			        debugPaint.setStyle(Paint.Style.FILL);
			        final String debugText =
			                "Text bounds: " + textBounds.toShortString() + "n" +
			                        "Target bounds: " + targetBounds.toShortString() + "n" +
			                        "Center: " + outerCircleCenter[0] + " " + outerCircleCenter[1] + "n" +
			                        "View size: " + getWidth() + " " + getHeight() + "n" +
			                        "Target bounds: " + targetBounds.toShortString();
			
			        if (debugStringBuilder == null) {
				            debugStringBuilder = new SpannableStringBuilder(debugText);
				        } else {
				            debugStringBuilder.clear();
				            debugStringBuilder.append(debugText);
				        }
			
			        if (debugLayout == null) {
				            debugLayout = new DynamicLayout(debugText, debugTextPaint, getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
				        }
			
			        final int saveCount = c.save();
			        {
				            debugPaint.setARGB(220, 0, 0, 0);
				            c.translate(0.0f, topBoundary);
				            c.drawRect(0.0f, 0.0f, debugLayout.getWidth(), debugLayout.getHeight(), debugPaint);
				            debugPaint.setARGB(255, 255, 0, 0);
				            debugLayout.draw(c);
				        }
			        c.restoreToCount(saveCount);
			    }
		
		    void drawTintedTarget() {
			        final android.graphics.drawable.Drawable icon = target.icon;
			        if (!shouldTintTarget || icon == null) {
				            tintedTarget = null;
				            return;
				        }
			
			        if (tintedTarget != null) return;
			
			        tintedTarget = Bitmap.createBitmap(icon.getIntrinsicWidth(), icon.getIntrinsicHeight(),
			                Bitmap.Config.ARGB_8888);
			        final Canvas canvas = new Canvas(tintedTarget);
			        icon.setColorFilter(new PorterDuffColorFilter(
			                outerCirclePaint.getColor(), PorterDuff.Mode.SRC_ATOP));
			        icon.draw(canvas);
			        icon.setColorFilter(null);
			    }
		
		    void updateTextLayouts() {
			        final int textWidth = Math.min(getWidth(), TEXT_MAX_WIDTH) - TEXT_PADDING * 2;
			        if (textWidth <= 0) {
				            return;
				        }
			
			        titleLayout = new StaticLayout(title, titlePaint, textWidth,
			                Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
			
			        if (description != null) {
				            descriptionLayout = new StaticLayout(description, descriptionPaint, textWidth,
				                    Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
				        } else {
				            descriptionLayout = null;
				        }
			    }
		
		    float halfwayLerp(float lerp) {
			        if (lerp < 0.5f) {
				            return lerp / 0.5f;
				        }
			
			        return (1.0f - lerp) / 0.5f;
			    }
		
		    float delayedLerp(float lerp, float threshold) {
			        if (lerp < threshold) {
				            return 0.0f;
				        }
			
			        return (lerp - threshold) / (1.0f - threshold);
			    }
		
		    void calculateDimensions() {
			        textBounds = getTextBounds();
			        outerCircleCenter = getOuterCircleCenterPoint();
			        calculatedOuterCircleRadius = getOuterCircleRadius(outerCircleCenter[0], outerCircleCenter[1], textBounds, targetBounds);
			    }
		
		    void calculateDrawingBounds() {
			        if (outerCircleCenter == null) {
				            // Called dismiss before we got a chance to display the tap target
				            // So we have no center -> cant determine the drawing bounds
				            return;
				        }
			        drawingBounds.left = (int) Math.max(0, outerCircleCenter[0] - outerCircleRadius);
			        drawingBounds.top = (int) Math.min(0, outerCircleCenter[1] - outerCircleRadius);
			        drawingBounds.right = (int) Math.min(getWidth(),
			                outerCircleCenter[0] + outerCircleRadius + CIRCLE_PADDING);
			        drawingBounds.bottom = (int) Math.min(getHeight(),
			                outerCircleCenter[1] + outerCircleRadius + CIRCLE_PADDING);
			    }
		
		    int getOuterCircleRadius(int centerX, int centerY, Rect textBounds, Rect targetBounds) {
			        final int targetCenterX = targetBounds.centerX();
			        final int targetCenterY = targetBounds.centerY();
			        final int expandedRadius = (int) (1.1f * TARGET_RADIUS);
			        final Rect expandedBounds = new Rect(targetCenterX, targetCenterY, targetCenterX, targetCenterY);
			        expandedBounds.inset(-expandedRadius, -expandedRadius);
			
			        final int textRadius = maxDistanceToPoints(centerX, centerY, textBounds);
			        final int targetRadius = maxDistanceToPoints(centerX, centerY, expandedBounds);
			        return Math.max(textRadius, targetRadius) + CIRCLE_PADDING;
			    }
		
		    Rect getTextBounds() {
			        final int totalTextHeight = getTotalTextHeight();
			        final int totalTextWidth = getTotalTextWidth();
			
			        final int possibleTop = targetBounds.centerY() - TARGET_RADIUS - TARGET_PADDING - totalTextHeight;
			        final int top;
			        if (possibleTop > topBoundary) {
				            top = possibleTop;
				        } else {
				            top = targetBounds.centerY() + TARGET_RADIUS + TARGET_PADDING;
				        }
			
			        final int relativeCenterDistance = (getWidth() / 2) - targetBounds.centerX();
			        final int bias = relativeCenterDistance < 0 ? -TEXT_POSITIONING_BIAS : TEXT_POSITIONING_BIAS;
			        final int left = Math.max(TEXT_PADDING, targetBounds.centerX() - bias - totalTextWidth);
			        final int right = Math.min(getWidth() - TEXT_PADDING, left + totalTextWidth);
			        return new Rect(left, top, right, top + totalTextHeight);
			    }
		
		    int[] getOuterCircleCenterPoint() {
			        if (inGutter(targetBounds.centerY())) {
				            return new int[]{targetBounds.centerX(), targetBounds.centerY()};
				        }
			
			        final int targetRadius = Math.max(targetBounds.width(), targetBounds.height()) / 2 + TARGET_PADDING;
			        final int totalTextHeight = getTotalTextHeight();
			
			        final boolean onTop = targetBounds.centerY() - TARGET_RADIUS - TARGET_PADDING - totalTextHeight > 0;
			
			        final int left = Math.min(textBounds.left, targetBounds.left - targetRadius);
			        final int right = Math.max(textBounds.right, targetBounds.right + targetRadius);
			        final int titleHeight = titleLayout == null ? 0 : titleLayout.getHeight();
			        final int centerY = onTop ?
			                targetBounds.centerY() - TARGET_RADIUS - TARGET_PADDING - totalTextHeight + titleHeight
			                :
			                targetBounds.centerY() + TARGET_RADIUS + TARGET_PADDING + titleHeight;
			
			        return new int[] { (left + right) / 2, centerY };
			    }
		
		    int getTotalTextHeight() {
			        if (titleLayout == null) {
				            return 0;
				        }
			
			        if (descriptionLayout == null) {
				            return titleLayout.getHeight() + TEXT_SPACING;
				        }
			
			        return titleLayout.getHeight() + descriptionLayout.getHeight() + TEXT_SPACING;
			    }
		
		    int getTotalTextWidth() {
			        if (titleLayout == null) {
				            return 0;
				        }
			
			        if (descriptionLayout == null) {
				            return titleLayout.getWidth();
				        }
			
			        return Math.max(titleLayout.getWidth(), descriptionLayout.getWidth());
			    }
		    boolean inGutter(int y) {
			        if (bottomBoundary > 0) {
				            return y < GUTTER_DIM || y > bottomBoundary - GUTTER_DIM;
				        } else {
				            return y < GUTTER_DIM || y > getHeight() - GUTTER_DIM;
				        }
			    }
		    int maxDistanceToPoints(int x1, int y1, Rect bounds) {
			        final double tl = distance(x1, y1, bounds.left, bounds.top);
			        final double tr = distance(x1, y1, bounds.right, bounds.top);
			        final double bl = distance(x1, y1, bounds.left, bounds.bottom);
			        final double br = distance(x1, y1, bounds.right, bounds.bottom);
			        return (int) Math.max(tl, Math.max(tr, Math.max(bl, br)));
			    }
		    double distance(int x1, int y1, int x2, int y2) {
			        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			    }
		    void invalidateViewAndOutline(Rect bounds) {
			        invalidate(bounds);
			        if (outlineProvider != null && Build.VERSION.SDK_INT >= 21) {
				            invalidateOutline();
				        }
			    }
	}
			static class ViewUtil {
		
		    ViewUtil() {}
		
		    private static boolean isLaidOut(View view) {
			        return true;
			    }
		    static void onLaidOut(final View view, final Runnable runnable) {
			        if (isLaidOut(view)) {
				            runnable.run();
				            return;
				        }
			        final ViewTreeObserver observer = view.getViewTreeObserver();
			        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
				            @Override
				            public void onGlobalLayout() {
					                final ViewTreeObserver trueObserver;
					                if (observer.isAlive()) {
						                    trueObserver = observer;
						                } else {
						                    trueObserver = view.getViewTreeObserver();
						                }
					                removeOnGlobalLayoutListener(trueObserver, this);
					                runnable.run();
					            }
				        });
			    }
		    @SuppressWarnings("deprecation")
		    static void removeOnGlobalLayoutListener(ViewTreeObserver observer,
		                                             ViewTreeObserver.OnGlobalLayoutListener listener) {
			        if (Build.VERSION.SDK_INT >= 16) {
				            observer.removeOnGlobalLayoutListener(listener);
				        } else {
				            observer.removeGlobalOnLayoutListener(listener);
				        }
			    }
		    static void removeView(ViewManager parent, View child) {
			        if (parent == null || child == null) {
				            return;
				        }
			        try {
				            parent.removeView(child);
				        } catch (Exception ignored) {
				        }
			    }
	}
			static class ViewTapTarget extends TapTarget {
		    final View view;
		
		    ViewTapTarget(View view, CharSequence title,  CharSequence description) {
			        super(title, description);
			        if (view == null) {
				            throw new IllegalArgumentException("Given null view to target");
				        }
			        this.view = view;
			    }
		
		    @Override
		    public void onReady(final Runnable runnable) {
			        ViewUtil.onLaidOut(view, new Runnable() {
				            @Override
				            public void run() {
					                // Cache bounds
					                final int[] location = new int[2];
					                view.getLocationOnScreen(location);
					                bounds = new Rect(location[0], location[1],
					                        location[0] + view.getWidth(), location[1] + view.getHeight());
					
					                if (icon == null && view.getWidth() > 0 && view.getHeight() > 0) {
						                    final Bitmap viewBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
						                    final Canvas canvas = new Canvas(viewBitmap);
						                    view.draw(canvas);
						                    icon = new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), viewBitmap);
						                    icon.setBounds(0, 0, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
						                }
					
					                runnable.run();
					            }
				        });
			    }
	}
			static class TapTargetSequence {
		    private final Activity activity;
		    private final Dialog dialog;
		    private final Queue<TapTarget> targets;
		    private boolean active;
		    private TapTargetView currentView;
		    Listener listener;
		    boolean considerOuterCircleCanceled;
		    boolean continueOnCancel;
		    public interface Listener {
			        void onSequenceFinish();
			        void onSequenceStep(TapTarget lastTarget, boolean targetClicked);
			        void onSequenceCanceled(TapTarget lastTarget);
			    }
		    public TapTargetSequence(Activity activity) {
			        if (activity == null) throw new IllegalArgumentException("Activity is null");
			        this.activity = activity;
			        this.dialog = null;
			        this.targets = new LinkedList<>();
			    }
		    public TapTargetSequence(Dialog dialog) {
			        if (dialog == null) throw new IllegalArgumentException("Given null Dialog");
			        this.dialog = dialog;
			        this.activity = null;
			        this.targets = new LinkedList<>();
			    }
		    public TapTargetSequence targets(List<TapTarget> targets) {
			        this.targets.addAll(targets);
			        return this;
			    }
		    public TapTargetSequence targets(TapTarget... targets) {
			        Collections.addAll(this.targets, targets);
			        return this;
			    }
		    public TapTargetSequence target(TapTarget target) {
			        this.targets.add(target);
			        return this;
			    }
		    public TapTargetSequence continueOnCancel(boolean status) {
			        this.continueOnCancel = status;
			        return this;
			    }
		    public TapTargetSequence considerOuterCircleCanceled(boolean status) {
			        this.considerOuterCircleCanceled = status;
			        return this;
			    }
		    public TapTargetSequence listener(Listener listener) {
			        this.listener = listener;
			        return this;
			    }
		    public void start() {
			        if (targets.isEmpty() || active) {
				            return;
				        }
			        active = true;
			        showNext();
			    }
		    public void startWith(int targetId) {
			        if (active) {
				            return;
				        }
			        while (targets.peek() != null && targets.peek().id() != targetId) {
				            targets.poll();
				        }
			        TapTarget peekedTarget = targets.peek();
			        if (peekedTarget == null || peekedTarget.id() != targetId) {
				            throw new IllegalStateException("Given target " + targetId + " not in sequence");
				        }
			        start();
			    }
		    public void startAt(int index) {
			        if (active) {
				            return;
				        }
			        if (index < 0 || index >= targets.size()) {
				            throw new IllegalArgumentException("Given invalid index " + index);
				        }
			        final int expectedSize = targets.size() - index;
			        while (targets.peek() != null && targets.size() != expectedSize) {
				            targets.poll();
				        }
			        if (targets.size() != expectedSize) {
				            throw new IllegalStateException("Given index " + index + " not in sequence");
				        }
			        start();
			    }
		    public boolean cancel() {
			        if (targets.isEmpty() || !active) {
				            return false;
				        }
			        if (currentView == null || !currentView.cancelable) {
				            return false;
				        }
			        currentView.dismiss(false);
			        active = false;
			        targets.clear();
			        if (listener != null) {
				            listener.onSequenceCanceled(currentView.target);
				        }
			        return true;
			    }
		    void showNext() {
			        try {
				            TapTarget tapTarget = targets.remove();
				            if (activity != null) {
					                currentView = TapTargetView.showFor(activity, tapTarget, tapTargetListener);
					            } else {
					                currentView = TapTargetView.showFor(dialog, tapTarget, tapTargetListener);
					            }
				        } catch (NoSuchElementException e) {
				            // No more targets
				            if (listener != null) {
					                listener.onSequenceFinish();
					            }
				        }
			    }
		    private final TapTargetView.Listener tapTargetListener = new TapTargetView.Listener() {
			        @Override
			        public void onTargetClick(TapTargetView view) {
				            super.onTargetClick(view);
				            if (listener != null) {
					                listener.onSequenceStep(view.target, true);
					            }
				            showNext();
				        }
			        @Override
			        public void onOuterCircleClick(TapTargetView view) {
				            if (considerOuterCircleCanceled) {
					                onTargetCancel(view);
					            }
				        }
			        @Override
			        public void onTargetCancel(TapTargetView view) {
				            super.onTargetCancel(view);
				            if (continueOnCancel) {
					                if (listener != null) {
						                    listener.onSequenceStep(view.target, false);
						                }
					                showNext();
					            } else {
					                if (listener != null) {
						                    listener.onSequenceCanceled(view.target);
						                }
					            }
				        }
			    };
	}
	
	
	public void _inject(final String _link) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
			new CyberTask11().execute(_link);
		}else{
			new HUDTask().execute(_link);
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}