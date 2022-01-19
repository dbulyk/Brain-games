install: #Очищаем предыдущую сборку
	./gradlew clean install

run-dist: #Выполняем запуск файла
	./gradlew run

chmod permissions: #Даем разрешение на запуск файла
	chmod +x ./gradlew

check-updates: #Проверяем обновления зависимостей
	./gradlew dependencyUpdates

lint: #Проверяем стиль кода
	./gradlew checkstyleMain

build: #Выполняем сборку проекта
	./gradlew clean build
	make lint