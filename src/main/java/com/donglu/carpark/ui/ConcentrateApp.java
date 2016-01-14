package com.donglu.carpark.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.donglu.carpark.model.ConcentrateModel;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.SWTObservables;

public class ConcentrateApp {
	private DataBindingContext m_bindingContext;

	protected Shell shell;
	@Inject
	private ConcentratePresenter presenter;
	private ConcentrateModel model=new ConcentrateModel();
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			public void run() {
				try {
					Injector injector = Guice.createInjector();
					ConcentrateApp window = injector.getInstance(ConcentrateApp.class);
					window.open();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Open the window.
	 */
	public void open() {
		init();
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.setMaximized(true);
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	private void init() {
		presenter.setView(this);
		presenter.setModel(model);
		
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(487, 601);
		shell.setText("集中收费");
		shell.setLayout(new GridLayout(2, false));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label lblNewLabel_7 = new Label(composite, SWT.NONE);
		lblNewLabel_7.setText("进场图片");
		lblNewLabel_7.setAlignment(SWT.CENTER);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setLayout(new GridLayout(2, false));
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_composite_1.widthHint = 320;
		composite_1.setLayoutData(gd_composite_1);
		
		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("登录账户");
		
		text_5 = new Text(composite_1, SWT.BORDER);
		text_5.setEditable(false);
		text_5.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		GridData gd_text_5 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_5.widthHint = 150;
		text_5.setLayoutData(gd_text_5);
		
		Label lblNewLabel_4 = new Label(composite_1, SWT.NONE);
		lblNewLabel_4.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_4.setText("登录时间");
		
		text_6 = new Text(composite_1, SWT.BORDER);
		text_6.setEditable(false);
		text_6.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_6 = new Label(composite_1, SWT.NONE);
		lblNewLabel_6.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		lblNewLabel_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_6.setText("收费金额");
		
		text_7 = new Text(composite_1, SWT.BORDER);
		text_7.setEditable(false);
		text_7.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		lblNewLabel_5.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		lblNewLabel_5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_5.setText("免费金额");
		
		text_8 = new Text(composite_1, SWT.BORDER);
		text_8.setEditable(false);
		text_8.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
		Label label = new Label(composite_1, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label.setText("车牌号码");
		
		text = new Text(composite_1, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_1 = new Label(composite_1, SWT.NONE);
		label_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		label_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_1.setText("进场时间");
		
		text_1 = new Text(composite_1, SWT.BORDER);
		text_1.setEditable(false);
		text_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("停车时间");
		
		text_2 = new Text(composite_1, SWT.BORDER);
		text_2.setEditable(false);
		text_2.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("应收金额");
		
		text_3 = new Text(composite_1, SWT.BORDER);
		text_3.setEditable(false);
		text_3.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_2 = new Label(composite_1, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("实收金额");
		
		text_4 = new Text(composite_1, SWT.BORDER);
		text_4.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_2 = new Composite(composite_1, SWT.NONE);
		composite_2.setLayout(new GridLayout(1, false));
		composite_2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		
		Button btnNewButton = new Button(composite_2, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				presenter.searchAndCount();
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		btnNewButton.setText("查询计算");
		
		Button btnNewButton_1 = new Button(composite_2, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		btnNewButton_1.setText("收      费");
		
		Button btnNewButton_3 = new Button(composite_2, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_3.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		btnNewButton_3.setText("续      费");
		
		Button btnNewButton_4 = new Button(composite_2, SWT.NONE);
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_4.setFont(SWTResourceManager.getFont("微软雅黑", 12, SWT.BOLD));
		btnNewButton_4.setText("换      班");
		m_bindingContext = initDataBindings();

	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextText_5ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_5);
		IObservableValue userNameModelObserveValue = BeanProperties.value("userName").observe(model);
		bindingContext.bindValue(observeTextText_5ObserveWidget, userNameModelObserveValue, null, null);
		//
		IObservableValue observeTextText_6ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_6);
		IObservableValue workTimeModelObserveValue = BeanProperties.value("workTime").observe(model);
		bindingContext.bindValue(observeTextText_6ObserveWidget, workTimeModelObserveValue, null, null);
		//
		IObservableValue observeTextText_7ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_7);
		IObservableValue totalFactModelObserveValue = BeanProperties.value("totalFact").observe(model);
		bindingContext.bindValue(observeTextText_7ObserveWidget, totalFactModelObserveValue, null, null);
		//
		IObservableValue observeTextText_8ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_8);
		IObservableValue totalFreeModelObserveValue = BeanProperties.value("totalFree").observe(model);
		bindingContext.bindValue(observeTextText_8ObserveWidget, totalFreeModelObserveValue, null, null);
		//
		IObservableValue observeTextTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(text);
		IObservableValue plateNOModelObserveValue = BeanProperties.value("plateNO").observe(model);
		bindingContext.bindValue(observeTextTextObserveWidget, plateNOModelObserveValue, null, null);
		//
		IObservableValue observeTextText_1ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_1);
		IObservableValue inTimeModelObserveValue = BeanProperties.value("inTime").observe(model);
		bindingContext.bindValue(observeTextText_1ObserveWidget, inTimeModelObserveValue, null, null);
		//
		IObservableValue observeTextText_2ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_2);
		IObservableValue stillTimeModelObserveValue = BeanProperties.value("stillTime").observe(model);
		bindingContext.bindValue(observeTextText_2ObserveWidget, stillTimeModelObserveValue, null, null);
		//
		IObservableValue observeTextText_3ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_3);
		IObservableValue shouldMoneyModelObserveValue = BeanProperties.value("shouldMoney").observe(model);
		bindingContext.bindValue(observeTextText_3ObserveWidget, shouldMoneyModelObserveValue, null, null);
		//
		IObservableValue observeTextText_4ObserveWidget = WidgetProperties.text(SWT.Modify).observe(text_4);
		IObservableValue factMoneyModelObserveValue = BeanProperties.value("factMoney").observe(model);
		bindingContext.bindValue(observeTextText_4ObserveWidget, factMoneyModelObserveValue, null, null);
		//
		return bindingContext;
	}
}
