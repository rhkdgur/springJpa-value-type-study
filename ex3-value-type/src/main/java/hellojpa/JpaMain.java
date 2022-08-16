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
//			//==================== 인베디드 타입 테스트==============================//
//			Member member = new Member();
//			member.setName("embededTest");
//			member.setPeriod(new Period(LocalDateTime.now(), LocalDateTime.now()));
//			member.setAddress(new Address("city", "street", "zipcode"));
//			
//			//Address 객체를 이용하여 새로운 인베디드를 선언할 경우
//			member.setWorkAddress(new Address("workcity","workstreet","workzipcode"));
//
//			entityManager.persist(member);
//			//====================================================================
//			
//			
//			//===================== 인베디드 타입 테스트 2============================//
//			//인베디드 값 타입 공유 참조의 부작용
//			//Address를 공유할 경우...
//			Address address = new Address("city", "street", "zipcode");
//			
//			Member member1 = new Member();
//			member1.setName("name1");
//			member1.setPeriod(new Period(LocalDateTime.now(), LocalDateTime.now()));
//			member1.setAddress(address);
//			entityManager.persist(member1);
//			
//			//해결 방안 -> 공유 참조 부작용 안되게 하는 방법
//			//address를 복사해서 생성하여 사용하면 공유 부작용이 발생 안함~~~~~ 즉 복사생성자 사용
//			Address copyAddress = new Address(address.getCity(), address.getStreet(), address.getZipcode());
//			
//			Member member2 = new Member();
//			member2.setName("name2");
//			member2.setPeriod(new Period(LocalDateTime.now(), LocalDateTime.now()));
//			member2.setAddress(copyAddress);
//			entityManager.persist(member2);
//			
//			//member2에 address 값에 city 값을 변경하고자 했을 경우 city -> newCity로 변경
//			//이런 버그는 찾기 힘듬...
//			member2.getAddress().setCity("newCity"); // 결과는 member1 과 member2에 둘다 영향을 가게 되어 부작용 발생 이
//			
//			//만약 flush를 삭제하고 clear만 했을 경우 트랜잭션 진행 내에서 영속성 컨텍스트가 완전 초기화 되므로 아무것도 db에 반영하지 않음.
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
