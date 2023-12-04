from locust import HttpUser, task

class ServerTest(FastHttpUser):
    @task
    def api_test(self):
        self.client.get("/simplerequest")

class MyLocust(Locust):
 task_set = ServerTest
 min_wait = 2000
 max_wait = 5000