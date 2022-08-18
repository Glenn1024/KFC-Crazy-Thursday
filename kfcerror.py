class KFCError(Exception):
    def __init__(self, *args):
        super().__init__('KFC Crazy Thursday WhoEver Gives me 50 CNY, I Will Thank Him.')

raise KFCError
