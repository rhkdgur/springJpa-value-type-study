package hellojpa;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

//	public static void main(String[] args) {
//		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");
//		
//		EntityManager entityManager = emf.createEntityManager();
//		
//		EntityTransaction tx = entityManager.getTransaction();
//		tx.begin();
//		
//		try {
//		
//			//==================== �κ���� Ÿ�� �׽�Ʈ==============================//
//			Member member = new Member();
//			member.setName("embededTest");
//			member.setPeriod(new Period(LocalDateTime.now(), LocalDateTime.now()));
//			member.setAddress(new Address("city", "street", "zipcode"));
//			
//			//Address ��ü�� �̿��Ͽ� ���ο� �κ���带 ������ ���
//			member.setWorkAddress(new Address("workcity","workstreet","workzipcode"));
//
//			entityManager.persist(member);
//			//====================================================================
//			
//			
//			//===================== �κ���� Ÿ�� �׽�Ʈ 2============================//
//			//�κ���� �� Ÿ�� ���� ������ ���ۿ�
//			//Address�� ������ ���...
//			Address address = new Address("city", "street", "zipcode");
//			
//			Member member1 = new Member();
//			member1.setName("name1");
//			member1.setPeriod(new Period(LocalDateTime.now(), LocalDateTime.now()));
//			member1.setAddress(address);
//			entityManager.persist(member1);
//			
//			//�ذ� ��� -> ���� ���� ���ۿ� �ȵǰ� �ϴ� ���
//			//address�� �����ؼ� �����Ͽ� ����ϸ� ���� ���ۿ��� �߻� ����~~~~~ �� ��������� ���
//			Address copyAddress = new Address(address.getCity(), address.getStreet(), address.getZipcode());
//			
//			Member member2 = new Member();
//			member2.setName("name2");
//			member2.setPeriod(new Period(LocalDateTime.now(), LocalDateTime.now()));
//			member2.setAddress(copyAddress);
//			entityManager.persist(member2);
//			
//			//member2�� address ���� city ���� �����ϰ��� ���� ��� city -> newCity�� ����
//			//�̷� ���״� ã�� ����...
//			member2.getAddress().setCity("newCity"); // ����� member1 �� member2�� �Ѵ� ������ ���� �Ǿ� ���ۿ� �߻� ��
//			
//			//���� flush�� �����ϰ� clear�� ���� ��� Ʈ����� ���� ������ ���Ӽ� ���ؽ�Ʈ�� ���� �ʱ�ȭ �ǹǷ� �ƹ��͵� db�� �ݿ����� ����.
//			entityManager.flush();
//			entityManager.clear();
//			
//			Member findmember1 = entityManager.find(Member.class, member1.getId());
//			Member findmember2 = entityManager.find(Member.class, member2.getId());
//			
//			System.out.println("===========================================");
//			System.out.println("member1 = "+findmember1.getAddress().getCity());
//			System.out.println("member2 = "+findmember2.getAddress().getCity());
//			System.out.println("===========================================");
//			
//		tx.commit();
//		}catch (Exception e) {
//			e.printStackTrace();
//			tx.rollback();
//		}finally {
//			entityManager.close();
//		}
//		emf.close();
//	}

}
