package com.djn.cn.hsf.base.listener;

import java.util.UUID;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.djn.cn.hsf.base.rpc.IUserInfoRPC;
public class StartListener implements ServletContextListener{

	@Override
	public void contextInitialized( ServletContextEvent sce ) {
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext( sce.getServletContext() );
		final IUserInfoRPC iUserInfoRPC = ( IUserInfoRPC ) ctx.getBean( "iUserInfoRPC" );
		Thread thread = new Thread( new Runnable() {
			@Override
			public void run() {
				while ( true ) {
					try {
						Thread.sleep( 500l );
						System.out.println("client:"+iUserInfoRPC.getById( UUID.randomUUID().toString()));
					} catch ( Throwable e ) {
						e.printStackTrace();
					}
				}
			}
		} );
		thread.start();
	}

	@Override
	public void contextDestroyed( ServletContextEvent sce ) {
		// TODO Auto-generated method stub
	}

}
