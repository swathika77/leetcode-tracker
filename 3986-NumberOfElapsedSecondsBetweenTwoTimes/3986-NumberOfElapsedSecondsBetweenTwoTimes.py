# Last updated: 09/10/2026, 09:22:41
class Solution:
    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
        def to_seconds(time):
            h,m,s= map(int,time.split(":"))
            return h*3600 + m*60+s
        return to_seconds(endTime) - to_seconds(startTime)















        
        