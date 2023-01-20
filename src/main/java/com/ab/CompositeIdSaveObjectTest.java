package com.ab;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ab.entity.ProgrammerProjId;
import com.ab.entity.ProgrammerProjectInfo;
import com.ab.util.HibernateUtility;

public class CompositeIdSaveObjectTest {
	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtility.getSessionFactory();
				Session session = HibernateUtility.getSession()) {
			try {
				Transaction tx = session.beginTransaction();
				ProgrammerProjId pId = new ProgrammerProjId();
				pId.setPid(102);
				pId.setProjId(1001);

				ProgrammerProjectInfo projectInfo = new ProgrammerProjectInfo();
				projectInfo.setId(pId);
				projectInfo.setPersonName("Raj");
				projectInfo.setProjName("QMS");
				projectInfo.setTeamSize(100);

				session.save(projectInfo);
				tx.commit();

				System.out.println("ID: " + projectInfo);

			} catch (HibernateException hbe) {
				hbe.printStackTrace();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}
}
