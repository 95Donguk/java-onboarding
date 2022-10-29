# 기능 목록

## Problem 1
1. 1부터 400까지 책 페이지 설정 기능
2. 책의 페이지 랜덤 생성 기능
   1. 포비와 크롱 각자 랜덤 페이지를 얻는다.
   2. [왼쪽 페이지 번호, 오른쪽 페이지 번호] 출력하기
3. 점수 비교 기능
   1. 왼쪽 페이지의 각 자리 숫자를 모두 더하거나 곱해 가장 큰 수를 도출
   2. 오른쪽 페이지의 각 자리 숫자를 모두 더하거나 곱해 가장 큰 수를 도출
   3. 본인의 베스트 점수 결산
4. 결과 출력 기능
   1. 포비가 이기면 1 출력
   2. 크롱이 이기면 2 출력
   3. 무승부 0 출력
   4. 예외사항이 발생된다면 -1 출력
      1. 예외사항
         1. 리스트에 2개의 데이터가 있는 경우
         2. 왼쪽 페이지 번호가 오른쪽 페이지 번호보다 값이 높은 경우
         3. 왼쪽 페이지가 짝수 번호이거나 오른쪽 페이지가 홀수번호 인 경우
         4. 왼쪽 페이지와 오른쪽 페이지의 차가 1이 아닌 경우

## Problem 2

1. 암호문 예외처리 기능
   1. 1 이상 1000 이하의 문자 입력하도록 제한
   2. 알파벳 소문자로 입력하도록 제한
2. 암호문 해독 기능
   1. 암호문을 한 문자씩 쪼개는 기능
   2. 연속으로 중복된 문자가 있는지 확인 및 제거하는 기능
   3. 해독된 문자 결과를 조합하는 기능 
3. 결과 출력 기능
   1. 입력한 문자와 중복 제거 결과 출력

## Problem 3

1. 숫자 생성 기능
   1. 1이상 10,000 이하의 자연수 입력하도록 제한
2. 1부터 입력한 숫자 값까지 스캔 기능
   1. 3, 6, 9 숫자 나올 때마다 카운트 1 중가
3. 결과 출력
   1. 입력한 숫자와 총 카운트 수 출력 

## Problem 4

1. 문자 생성 기능
   1. word 길이는 1 이상 1,000이하로 제한
2. 알파벳만 문자 변환 기능
   1. 대문자는 소문자로, 소문자는 대문자로 변환
3. 결과 출력 기능
   1. 입력한 문자와 문자 변환된 결과 출력
   
## Problem 5

1. 돈 입력 기능
   1. 돈은 1 이상 1,000,000 아하인 자연수로 제한
2. 화폐 단위가 큰 단위대로 쪼꺠는 기능
3. 결과 출력 기능

## Problem 6

1. 이메일, 닉네임 생성 기능
   1. 정규표현식으로 이메일 형식에 부합한지 체크
   2. 이메일의 길이는 11자 이상 20자 미만으로 제한
   3. 이메일 도메인은 email.com 으로만 제한
   4. 닉네임은 한글로만 1자 이상 20자 미만으로 제한
2. 닉네임 중복 체크 기능
   1. 두 글자 이상의 문자가 연속적으로 같으면 중복
3. 결과 출력 기능

## Problem 7

1. user, friends, visitors 아이디 생성 기능
   1. 아이디는 알파벳 소문자로 제한
      1. user의 아이디는 길이가 1 이상 30 이하인 문자열로 제한
      2. friends는 길이가 1 이상 10,100 이하인 리스트로 제한
         1. 친구 관계는 길이가 2인 리스트로 제한
            1. firends의 아이디의 길이가 1 이상 30 이하인 문자열로 제한
      3. visitors의 길이는 0 이상 10,000 이하인 리스트로 제한
   2. 생성 제한
      1. 동일한 친구 관계가 중복인 경우
      2. 추천한 친구가 없는 경우
2. 친구 추천 점수 계산 기능
   1. 함께 아는 친구의 수 만큼 10점 씩 추가
   2. 타임라인에 방문한 횟수 만큼 1점 씩 추가
3. 결과 출력 기능
   1. 총 점수 내림차순으로 최대 5명 출력
   2. 점수가 같은 경우 이름 순으로 출력